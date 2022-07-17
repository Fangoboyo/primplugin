package games.bnogocarft.bnogorpg.recode.Reforge

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import tech.nully.primplug.recode.Utils.InventoryUtils

class ReforgeCommand: CommandExecutor {
    override fun onCommand(sender: CommandSender?, cmd: Command?, label: String?, args: Array<out String>?): Boolean {
        if (sender !is Player) {
            sender!!.sendMessage("Only players can use this command")
            return true
        }

        val reforgeInv = InventoryUtils.generateReforgeGUI()
        val playerSender = sender as Player

        playerSender.openInventory(reforgeInv)
        return true
    }
}