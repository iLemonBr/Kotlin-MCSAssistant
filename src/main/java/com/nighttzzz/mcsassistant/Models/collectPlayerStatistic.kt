package com.nighttzzz.mcsassistant.Models

import com.nighttzzz.mcsassistant.MCSAssistant
import com.nighttzzz.mcsassistant.userConfig
import org.bukkit.Statistic
import org.bukkit.entity.Player
import org.json.simple.JSONObject

private val ignoreParams = mapOf<Statistic, Boolean>(
        Statistic.DROP to true,
        Statistic.PICKUP to true,
        Statistic.MINE_BLOCK to true,
        Statistic.USE_ITEM to true,
        Statistic.BREAK_ITEM to true,
        Statistic.CRAFT_ITEM to true,
        Statistic.KILL_ENTITY to true,
        Statistic.ENTITY_KILLED_BY to true
)

fun collectPlayerStatistic(player: Player, is_online: Boolean) {

    val statistics = Statistic.values().filter { ignoreParams[it] == null }
    var userStatistic = mutableMapOf<String, Int>()

    statistics.forEach {
        userStatistic[it.name] = player.getStatistic(it)
    }

    val body = mapOf<String, Any>(
            "name" to player.name,
            "uuid" to player.uniqueId.toString(),
            "statistics" to userStatistic,
            "isOnline" to is_online
    )

    val config = userConfig ?: return
    val url = config.getString("url")

    if (url != null) {
        postJson(url ,  JSONObject(body))
    } else {
        print("[FMCSA] Please set url to config.yml!")
    }
}