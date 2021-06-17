package me.waqe.plugin

import me.waqe.plugin.cmds.VersionCmd
import me.waqe.plugin.events.JoinEvent
import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.Material
import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.event.Listener
import org.bukkit.inventory.Inventory
import org.bukkit.inventory.ItemStack
import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.scheduler.BukkitRunnable
import java.util.*
import java.util.concurrent.ThreadLocalRandom


class App : JavaPlugin(), Listener {
    companion object {
        lateinit var instance: App
    }

    override fun onEnable() {
        instance = this
        //this.reloadConfig()
        //this.saveDefaultConfig()

        server.pluginManager.registerEvents(JoinEvent(this), this)
        getCommand("version")?.setExecutor(VersionCmd())

    }

    override fun onDisable() {

    }
}
