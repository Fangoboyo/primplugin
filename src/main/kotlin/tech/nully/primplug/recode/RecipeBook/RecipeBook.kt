package tech.nully.primplug.recode.RecipeBook

import org.bukkit.Bukkit
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.ShapedRecipe
import tech.nully.primplug.recode.RecipeBook.RecipeManager.Companion.pageMap

class RecipeBook {
    companion object {
        val pages = ArrayList<RecipePage>()
        fun getRecipePage(page: Int): RecipePage {
            return pages[page + 1]
        }

        fun getRecipeFor(item: ItemStack): RecipePage? { // Returns a recipe page for the given item, returns null if no recipe is found
            val recipe: ShapedRecipe
            try {
                recipe = Bukkit.getRecipesFor(item) as ShapedRecipe
            } catch (e: NullPointerException) {
                return null
            }
            return pageMap[recipe]
        }
    }
}