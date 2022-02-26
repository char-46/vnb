package me.hsr

import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescription
import net.mamoe.mirai.console.plugin.jvm.KotlinPlugin
import net.mamoe.mirai.utils.info

object Vnb : KotlinPlugin(
    JvmPluginDescription(
        id = "me.hsr.vnb",
        name = "VNB plugin",
        version = "1.0-SNAPSHOT",
    ) {
        author("char46")
    }
) {
    override fun onEnable() {
        logger.info { "Plugin loaded" }
    }
}