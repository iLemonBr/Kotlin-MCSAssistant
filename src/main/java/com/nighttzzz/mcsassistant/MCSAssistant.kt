package com.nighttzzz.mcsassistant
import com.nighttzzz.mcsassistant.Listeners.PlayerJoinEvent
import com.nighttzzz.mcsassistant.Listeners.PlayerQuitEvent
import org.bukkit.configuration.file.FileConfiguration

import org.bukkit.plugin.java.JavaPlugin
import java.io.*
import java.net.HttpURLConnection
import java.net.URL
import java.nio.charset.StandardCharsets

var userConfig: FileConfiguration? = null

class MCSAssistant : JavaPlugin() {


    override fun onEnable() {
        setConfig()
        userConfig = config

        server.pluginManager.registerEvents(PlayerJoinEvent(), this)
        server.pluginManager.registerEvents(PlayerQuitEvent(), this)
    }

    override fun onDisable() {
    }

    fun setConfig() {
        val defaultConfig = config
        defaultConfig.addDefault("url", "https://post-url-you-want-is-here")
        defaultConfig.options().copyDefaults(true)
        saveConfig()
    }
}
