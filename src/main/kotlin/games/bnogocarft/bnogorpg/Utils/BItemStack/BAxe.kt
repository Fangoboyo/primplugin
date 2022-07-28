package games.bnogocarft.bnogorpg.Utils.BItemStack

import org.bukkit.inventory.ItemStack

data class BAxe(val item: ItemStack) : BItem(item){
    val breakSpeed: Int = when (item.itemMeta.displayName) {
        "Diamond Axe" -> 8
        "Gold Axe" -> 12
        "Iron Axe" -> 6
        "Stone Axe" -> 4
        "Wooden Axe" -> 2
        else -> -1
    }
}