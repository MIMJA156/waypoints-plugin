package org.mimja.waypoints;
import org.bukkit.Material;
import org.bukkit.inventory.ShapedRecipe;
import org.mimja.waypoints.Items.WaypointItem;

public class Crafting {
    static ShapedRecipe getWaypointRecipe() {
        ShapedRecipe recipe = new ShapedRecipe(PluginNamespace.get().getRecipeKey(), WaypointItem.getWaypointItem());

        recipe.shape(
            "GEG",
            "DPD",
            "OCO"
        );

        recipe.setIngredient('G', Material.GOLD_INGOT);
        recipe.setIngredient('E', Material.END_CRYSTAL);
        recipe.setIngredient('D', Material.DIAMOND);
        recipe.setIngredient('P', Material.ENDER_PEARL);
        recipe.setIngredient('O', Material.OBSIDIAN);
        recipe.setIngredient('C', Material.CRYING_OBSIDIAN);

        return recipe;
    }
}