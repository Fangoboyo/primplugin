package tech.nully.primplug.crafting.customRecipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.material.MaterialData;

import tech.nully.primplug.Armor.armorItems.Drakon;
import tech.nully.primplug.Armor.armorItems.PetheriteSet;
import tech.nully.primplug.Armor.armorItems.cactusArmor;
import tech.nully.primplug.Armor.armorItems.demigodArmor;
import tech.nully.primplug.Armor.armorItems.hardenedDiamond;
import tech.nully.primplug.Armor.armorItems.lapisArmor;
import tech.nully.primplug.Armor.armorItems.platedArmor;
import tech.nully.primplug.Armor.armorItems.reaperArmor;
import tech.nully.primplug.Armor.armorItems.undeadArmor;
import tech.nully.primplug.Armor.armorItems.wizardRobes;
import tech.nully.primplug.Tools.zeusBolt;
import tech.nully.primplug.crafting.overridenRecipes.overridenRecipeItems;

public class armorRecipes {

    // TODO: ADD THE NEW ARMOR ITEMS CRAFTING RECIPES -BigZ

    public static void init() {
        cactusChesRecipe();
        PetheriteChesRecipe();
        diaChesRecipe();
        ironChesRecipe();
        demichesrecipe();
        drakonchesrecipe();
        hdiachesrecipe();
        lapischesrecipe();
        platedchesrecipe();
        reaperchesrecipe();
        undeadchesrecipe();
        wizchesrecipe();


        cactusHelmRecipe();
        PetheriteHelmRecipe();
        diaHelmRecipe();
        ironHelmRecipe();
        demihelmrecipe();
        drakonhelmrecipe();
        hdiahelmrecipe();
        lapishelmrecipe();
        platedhelmrecipe();
        reaperhelmrecipe();
        undeadhelmrecipe();
        wizhatrecipe();


        cactusLegRecipe();
        PetheriteLegRecipe();
        diaLegRecipe();
        ironLegRecipe();
        demiLegrecipe();
        drakonlegrecipe();
        hdialegrecipe();
        lapislegrecipe();
        platedlegrecipe();
        reaperlegrecipe();
        undeadlegrecipe();
        wizlegrecipe();


        cactusBootsRecipe();
        PetheriteBootsRecipe();
        diaBootsRecipe();
        ironBootsRecipe();
        demibootsrecipe();
        drakonbootsrecipe();
        hdiabootsrecipe();
        lapisbootsrecipe();
        platedbootsrecipe();
        reaperbootsrecipe();
        undeadbootsrecipe();
        wizbootsrecipe();
    }

// Bongo why tf is the server not working
// TODO: add recipe for new armors -BigZ

   private static void wizbootsrecipe() {
    ShapedRecipe wizboots = new ShapedRecipe(wizardRobes.leg);

    wizboots.shape("   ", "^ ^", "^ ^");
    wizboots.setIngredient('^', new MaterialData(Material.SULPHUR, (byte) 1));
    Bukkit.getServer().addRecipe(wizboots);
    }

    private static void undeadbootsrecipe() {
        ShapedRecipe undeadboots = new ShapedRecipe(undeadArmor.leg);

        undeadboots.shape("   ", "^ ^", "^ ^");
        undeadboots.setIngredient('^', new MaterialData(Material.ROTTEN_FLESH, (byte) 1));
        Bukkit.getServer().addRecipe(undeadboots);
    }

    private static void reaperbootsrecipe() {
        ShapedRecipe reaperboots = new ShapedRecipe(reaperArmor.leg);

        reaperboots.shape("   ", "^ ^", "^ ^");
        reaperboots.setIngredient('^', new MaterialData(Material.IRON_SWORD, (byte) 1));
        Bukkit.getServer().addRecipe(reaperboots);
    }

    private static void platedbootsrecipe() {
        ShapedRecipe platedboots = new ShapedRecipe(platedArmor.leg);

        platedboots.shape("   ", "^ ^", "^ ^");
        platedboots.setIngredient('^', new MaterialData(Material.LAPIS_ORE, (byte) 1));
        Bukkit.getServer().addRecipe(platedboots);
    }

    private static void lapisbootsrecipe() {
        ShapedRecipe lapisboots = new ShapedRecipe(lapisArmor.leg);

        lapisboots.shape("   ", "^ ^", "^ ^");
        lapisboots.setIngredient('^', new MaterialData(Material.LAPIS_BLOCK, (byte) 1));
        Bukkit.getServer().addRecipe(lapisboots);
    }

    private static void hdiabootsrecipe() {
        ShapedRecipe hdiaboots = new ShapedRecipe(hardenedDiamond.leg);

        hdiaboots.shape("   ", "^ ^", "^ ^");
        hdiaboots.setIngredient('^', new MaterialData(Material.DIAMOND_BLOCK, (byte) 1));
        Bukkit.getServer().addRecipe(hdiaboots);
    }

    private static void drakonbootsrecipe() {
        ShapedRecipe drakonboots = new ShapedRecipe(Drakon.leg);

        drakonboots.shape("   ", "^ ^", "^ ^");
        drakonboots.setIngredient('^', new MaterialData(Material.BONE, (byte) 1));
        Bukkit.getServer().addRecipe(drakonboots);
    }

    private static void demibootsrecipe() {
        ShapedRecipe demiboots = new ShapedRecipe(demigodArmor.leg);

        demiboots.shape("   ", "^ ^", "^ ^");
        demiboots.setIngredient('^', new MaterialData(Material.GOLD_ORE, (byte) 1));
        Bukkit.getServer().addRecipe(demiboots);
    }

    private static void wizlegrecipe() {
        ShapedRecipe wizleg = new ShapedRecipe(wizardRobes.leg);

        wizleg.shape("^^^", "^ ^", "^ ^");
        wizleg.setIngredient('^', new MaterialData(Material.SULPHUR, (byte ) 1));
        Bukkit.getServer().addRecipe(wizleg);
    }

    private static void undeadlegrecipe() {
        ShapedRecipe undeadleg = new ShapedRecipe(undeadArmor.leg);

        undeadleg.shape("^^^", "^ ^", "^ ^");
        undeadleg.setIngredient('^', new MaterialData(Material.ROTTEN_FLESH, (byte ) 1));
        Bukkit.getServer().addRecipe(undeadleg);
    }

    private static void reaperlegrecipe() {
        ShapedRecipe reaperleg = new ShapedRecipe(reaperArmor.leg);

        reaperleg.shape("^^^", "^ ^", "^ ^");
        reaperleg.setIngredient('^', new MaterialData(Material.IRON_SWORD, (byte ) 1));
        Bukkit.getServer().addRecipe(reaperleg);
    }

    private static void platedlegrecipe() {
        ShapedRecipe platedleg = new ShapedRecipe(platedArmor.leg);

        platedleg.shape("^^^", "^ ^", "^ ^");
        platedleg.setIngredient('^', new MaterialData(Material.LAPIS_ORE, (byte ) 1));
        Bukkit.getServer().addRecipe(platedleg);
    }

    private static void lapislegrecipe() {
        ShapedRecipe lapisleg = new ShapedRecipe(lapisArmor.leg);

        lapisleg.shape("^^^", "^ ^", "^ ^");
        lapisleg.setIngredient('^', new MaterialData(Material.LAPIS_BLOCK, (byte ) 1));
        Bukkit.getServer().addRecipe(lapisleg);
    }

    private static void hdialegrecipe() {
        ShapedRecipe hdialeg = new ShapedRecipe(hardenedDiamond.leg);

        hdialeg.shape("^^^", "^ ^", "^ ^");
        hdialeg.setIngredient('^', new MaterialData(Material.DIAMOND_BLOCK, (byte ) 1));
        Bukkit.getServer().addRecipe(hdialeg);
    }

    private static void drakonlegrecipe() {
        ShapedRecipe drakonleg = new ShapedRecipe(Drakon.leg);

        drakonleg.shape("^^^", "^ ^", "^ ^");
        drakonleg.setIngredient('^', new MaterialData(Material.BONE, (byte ) 1));
        Bukkit.getServer().addRecipe(drakonleg);
    }

    private static void demiLegrecipe() {
        ShapedRecipe demileg = new ShapedRecipe(demigodArmor.leg);

        demileg.shape("^^^", "^ ^", "^ ^");
        demileg.setIngredient('^', new MaterialData(Material.GOLD_ORE, (byte) 1));
        Bukkit.getServer().addRecipe(demileg);
    }

    private static void wizhatrecipe() {
        ShapedRecipe wizhat = new ShapedRecipe(wizardRobes.helm);

        wizhat.shape("^^^", "^ ^", "   ");
        wizhat.setIngredient('^', new MaterialData(Material.SULPHUR, (byte) 1));
        Bukkit.getServer().addRecipe(wizhat);
    }

    private static void undeadhelmrecipe() {
        ShapedRecipe undeadhelm = new ShapedRecipe(undeadArmor.helm);

        undeadhelm.shape("^^^", "^ ^", "   ");
        undeadhelm.setIngredient('^', new MaterialData(Material.ROTTEN_FLESH, (byte) 1));
        Bukkit.getServer().addRecipe(undeadhelm);
    }

    private static void reaperhelmrecipe() {
        ShapedRecipe reaperhelm = new ShapedRecipe(reaperArmor.helm);

        reaperhelm.shape("^^^", "^ ^", "   ");
        reaperhelm.setIngredient('^', new MaterialData(Material.IRON_SWORD, (byte) 1));
        Bukkit.getServer().addRecipe(reaperhelm);
    }

    private static void platedhelmrecipe() {
        ShapedRecipe platedhelm = new ShapedRecipe(platedArmor.helm);

        platedhelm.shape("^^^", "^ ^", "   ");
        platedhelm.setIngredient('^', new MaterialData(Material.LAPIS_ORE, (byte) 1));
        Bukkit.getServer().addRecipe(platedhelm);
    }

    private static void lapishelmrecipe() {
        ShapedRecipe lapishelm = new ShapedRecipe(lapisArmor.helm);

        lapishelm.shape("^^^", "^ ^", "   ");
        lapishelm.setIngredient('^', new MaterialData(Material.LAPIS_BLOCK, (byte) 1));
        Bukkit.getServer().addRecipe(lapishelm);
    }

    private static void hdiahelmrecipe() {
        ShapedRecipe hdiahelm = new ShapedRecipe(hardenedDiamond.helm);

        hdiahelm.shape("^^^", "^ ^", "   ");
        hdiahelm.setIngredient('^', new MaterialData(Material.DIAMOND_BLOCK, (byte) 1));
        Bukkit.getServer().addRecipe(hdiahelm);
    }

    private static void drakonhelmrecipe() {
        ShapedRecipe drakonhelm = new ShapedRecipe(Drakon.helm);

        drakonhelm.shape("^^^", "^ ^", "   ");
        drakonhelm.setIngredient('^', new MaterialData(Material.BONE, (byte) 1));
        Bukkit.getServer().addRecipe(drakonhelm);
    }

    private static void demihelmrecipe() {
        ShapedRecipe demihelm = new ShapedRecipe(demigodArmor.helm);

        demihelm.shape("^^^", "^ ^", "   ");
        demihelm.setIngredient('^', new MaterialData(Material.GOLD_ORE, (byte) 1));
        Bukkit.getServer().addRecipe(demihelm);
    }

    private static void wizchesrecipe() {
        ShapedRecipe wizches = new ShapedRecipe(wizardRobes.chestplate);

        wizches.shape("^ ^", "^^^","^^^");
        wizches.setIngredient('^', new MaterialData(Material.SULPHUR, (byte) 1));
        Bukkit.getServer().addRecipe(wizches);
    }

    private static void undeadchesrecipe() {
        ShapedRecipe undeadches = new ShapedRecipe(undeadArmor.chestplate);

        undeadches.shape("^ ^", "^^^","^^^");
        undeadches.setIngredient('^', new MaterialData(Material.ROTTEN_FLESH, (byte) 1));
        Bukkit.getServer().addRecipe(undeadches);
    }

    private static void reaperchesrecipe() {
        ShapedRecipe reaperches = new ShapedRecipe(reaperArmor.chestplate);

        reaperches.shape("^ ^", "^^^","^^^");
        reaperches.setIngredient('^', new MaterialData(Material.IRON_SWORD, (byte) 1));
        Bukkit.getServer().addRecipe(reaperches);
    }

    private static void platedchesrecipe() {
        ShapedRecipe platedches = new ShapedRecipe(platedArmor.chestplate);

        platedches.shape("^ ^", "^^^","^^^");
        platedches.setIngredient('^', new MaterialData(Material.LAPIS_ORE, (byte) 1));
        Bukkit.getServer().addRecipe(platedches);
    }

    private static void lapischesrecipe() {
        ShapedRecipe lapisches = new ShapedRecipe(lapisArmor.chestplate);

        lapisches.shape("^ ^", "^^^","^^^");
        lapisches.setIngredient('^', new MaterialData(Material.LAPIS_BLOCK, (byte) 1));
        Bukkit.getServer().addRecipe(lapisches);
    }

    private static void hdiachesrecipe() {
        ShapedRecipe hdiaches = new ShapedRecipe(hardenedDiamond.ches);

        hdiaches.shape("^ ^", "^^^","^^^");
        hdiaches.setIngredient('^', new MaterialData(Material.DIAMOND_BLOCK, (byte) 1));
        Bukkit.getServer().addRecipe(hdiaches);
    }

    private static void drakonchesrecipe() {
        ShapedRecipe drakonches = new ShapedRecipe(Drakon.ches);

        drakonches.shape("^ ^", "^^^","^^^");
        drakonches.setIngredient('^', new MaterialData(Material.BONE, (byte) 1));
        Bukkit.getServer().addRecipe(drakonches);
    }

    private static void demichesrecipe() {
        ShapedRecipe demiches = new ShapedRecipe(demigodArmor.ches);

        demiches.shape("^ ^", "^^^","^^^");
        demiches.setIngredient('^', new MaterialData(Material.GOLD_ORE, (byte) 1)); 
        Bukkit.getServer().addRecipe(demiches);
    }

    private static void cactusHelmRecipe() {
        ShapedRecipe cacHelm = new ShapedRecipe(cactusArmor.helm);

        cacHelm.shape("^^^", "^ ^", "   ");
        cacHelm.setIngredient('^', new MaterialData(Material.CACTUS, (byte) 1));
        Bukkit.getServer().addRecipe(cacHelm);
    }

    private static void PetheriteHelmRecipe() {
        ShapedRecipe PHelm = new ShapedRecipe(PetheriteSet.helm);

        PHelm.shape("^^^", "^ ^", "   ");
        PHelm.setIngredient('^', new MaterialData(Material.OBSIDIAN, (byte) 1));
        Bukkit.getServer().addRecipe(PHelm);
    }

    private static void diaHelmRecipe() {
        ShapedRecipe diaHelm = new ShapedRecipe(overridenRecipeItems.diaHelm);

        diaHelm.shape("^^^", "^ ^", "   ");
        diaHelm.setIngredient('^', Material.DIAMOND);
        Bukkit.getServer().addRecipe(diaHelm);
    }

    private static void ironHelmRecipe() {
        ShapedRecipe ironHelm = new ShapedRecipe(overridenRecipeItems.ironBoots);

        ironHelm.shape("^^^", "^ ^", "   ");
        ironHelm.setIngredient('^', Material.IRON_INGOT);
        Bukkit.getServer().addRecipe(ironHelm);
    }

    private static void cactusChesRecipe() {
        ShapedRecipe cacChes = new ShapedRecipe(cactusArmor.ches);

        cacChes.shape("^ ^", "^^^", "^^^");
        cacChes.setIngredient('^', new MaterialData(Material.CACTUS, (byte) 1));
        Bukkit.getServer().addRecipe(cacChes);
    }

    private static void PetheriteChesRecipe() {
        ShapedRecipe PChes = new ShapedRecipe(PetheriteSet.ches);

        PChes.shape("^ ^", "^^^", "^^^");
        PChes.setIngredient('^', new MaterialData(Material.OBSIDIAN, (byte) 1));
        Bukkit.getServer().addRecipe(PChes);
    }

    private static void diaChesRecipe() {
        ShapedRecipe diaChes = new ShapedRecipe(overridenRecipeItems.diaChes);

        diaChes.shape("^ ^", "^^^", "^^^");
    diaChes.setIngredient('^', Material.DIAMOND);
        Bukkit.getServer().addRecipe(diaChes);
    }

    private static void ironChesRecipe() {
        ShapedRecipe ironChes = new ShapedRecipe(overridenRecipeItems.ironChes);

        ironChes.shape("^ ^", "^^^", "^^^");
        ironChes.setIngredient('^', Material.IRON_INGOT);
        Bukkit.getServer().addRecipe(ironChes);
    }



    private static void cactusLegRecipe() {
        ShapedRecipe cacLeg = new ShapedRecipe(cactusArmor.leg);

        cacLeg.shape("^^^", "^ ^", "^ ^");
        cacLeg.setIngredient('^', new MaterialData(Material.CACTUS, (byte) 1));
        Bukkit.getServer().addRecipe(cacLeg);
    }

    private static void PetheriteLegRecipe() {
        ShapedRecipe PLeg = new ShapedRecipe(PetheriteSet.leg);

        PLeg.shape("^^^", "^ ^", "^ ^");
        PLeg.setIngredient('^', new MaterialData(Material.OBSIDIAN, (byte) 1));
        Bukkit.getServer().addRecipe(PLeg);
    }

    private static void diaLegRecipe() {
        ShapedRecipe diaLeg = new ShapedRecipe(overridenRecipeItems.diaLeg);

        diaLeg.shape("^^^", "^ ^", "^ ^");
        diaLeg.setIngredient('^', Material.DIAMOND);
        Bukkit.getServer().addRecipe(diaLeg);
    }

    private static void ironLegRecipe() {
        ShapedRecipe ironLeg = new ShapedRecipe(overridenRecipeItems.ironLeg);

        ironLeg.shape("^^^", "^ ^", "^ ^");
        ironLeg.setIngredient('^', Material.IRON_INGOT);
        Bukkit.getServer().addRecipe(ironLeg);
    }



    private static void cactusBootsRecipe() {
        ShapedRecipe cacBoots = new ShapedRecipe(cactusArmor.boots);

        cacBoots.shape("   ", "^ ^", "^ ^");
        cacBoots.setIngredient('^', new MaterialData(Material.CACTUS, (byte) 1));
        Bukkit.getServer().addRecipe(cacBoots);
    }

    private static void PetheriteBootsRecipe() {
        ShapedRecipe PBoots = new ShapedRecipe(PetheriteSet.boots);

        PBoots.shape("   ", "^ ^", "^ ^");
        PBoots.setIngredient('^', new MaterialData(Material.OBSIDIAN, (byte) 1));
        Bukkit.getServer().addRecipe(PBoots);
    }

    private static void diaBootsRecipe() {
        ShapedRecipe diaBoots = new ShapedRecipe(overridenRecipeItems.diaBoots);

        diaBoots.shape("   ", "^ ^", "^ ^");
        diaBoots.setIngredient('^', Material.DIAMOND);
        Bukkit.getServer().addRecipe(diaBoots);
    }

    private static void ironBootsRecipe() {
        ShapedRecipe ironBoots = new ShapedRecipe(overridenRecipeItems.ironBoots);

        ironBoots.shape("   ", "^ ^", "^ ^");
        ironBoots.setIngredient('^', Material.IRON_INGOT);
        Bukkit.getServer().addRecipe(ironBoots);
    }
}
