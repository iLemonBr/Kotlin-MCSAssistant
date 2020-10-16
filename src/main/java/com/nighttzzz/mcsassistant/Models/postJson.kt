package com.nighttzzz.mcsassistant.Models

import org.json.simple.JSONObject
import java.io.BufferedWriter
import java.io.IOException
import java.io.OutputStreamWriter
import java.net.HttpURLConnection
import java.net.URL
import java.nio.charset.StandardCharsets

fun postJson(url: String, params: JSONObject) {

    try {
        val url: URL = URL(url)

        var connection = url.openConnection() as HttpURLConnection?
        connection ?: return

        connection.doOutput = true
        connection.requestMethod = "POST"
        connection.setRequestProperty("Content-Type", "application/json; charset=UTF-8")

        val writer = BufferedWriter(OutputStreamWriter(connection.outputStream, StandardCharsets.UTF_8))

        writer.write(params.toString())
        writer.flush()

        connection.connect()

        if (connection.responseCode == HttpURLConnection.HTTP_OK) {
            print("[FMCSA] Success send user statistics via http.")
        } else {
            print("[FMCSA] Faild to send. Invalid url.")
        }

        connection.disconnect()

    } catch (e: IOException) {
        e.printStackTrace()
    }
}
