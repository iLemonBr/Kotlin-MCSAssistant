package com.nighttzzz.mcsassistant.Listeners

import com.nighttzzz.mcsassistant.Models.collectPlayerStatistic
import org.bukkit.configuration.file.FileConfiguration

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerQuitEvent

class PlayerQuitEvent() : Listener {

    @EventHandler
    fun onPlayerQuit(event: PlayerQuitEvent?) {
        event ?: return

        collectPlayerStatistic(event.player, false)
    }
}