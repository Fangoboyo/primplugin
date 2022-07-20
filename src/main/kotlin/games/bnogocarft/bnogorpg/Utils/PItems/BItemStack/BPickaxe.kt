package games.bnogocarft.bnogorpg.Utils.PItems.BItemStack

import org.bukkit.inventory.ItemStack

data class BPickaxe(val item: ItemStack){
    val breakSpeed: Int = when (item.itemMeta.displayName) {
        "Diamond Pickaxe" -> 8
        "Gold Pickaxe" -> 12
        "Iron Pickaxe" -> 6
        "Stone Pickaxe" -> 4
        "Wooden Pickaxe" -> 2
        else -> 1
    }
}