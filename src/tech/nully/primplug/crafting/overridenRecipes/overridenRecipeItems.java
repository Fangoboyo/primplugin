package tech.nully.primplug.crafting.overridenRecipes;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import tech.nully.primplug.Armor.baseAttributesAdder;

public class overridenRecipeItems {
    
    public static ItemStack diaChes;
    public static ItemStack diaHelm;
    public static ItemStack diaLeg;
    public static ItemStack diaBoots;
    public static ItemStack diaSword;
    public static ItemStack diaAxe;
    public static ItemStack ironHelm;
    public static ItemStack ironChes; 
    public static ItemStack ironLeg;
    public static ItemStack ironBoots;
    public static ItemStack ironSword;
    public static ItemStack stoneAxe;
    public static ItemStack stoneSword;
    public static ItemStack woodAxe;
    public static ItemStack woodSword;

    public static void init() {
        createDiaHelm();
        createDiaChestplate();
        createDiaLeggings();
        createDiaBoots();
    }

    static baseAttributesAdder b = new baseAttributesAdder();


    private static void createDiaHelm() {
        // DEFINE THE META -------------
        ItemStack DiaHelm = new ItemStack(Material.DIAMOND_HELMET);
        ItemMeta DiaHelmMeta = DiaHelm.getItemMeta();


        // SET THE META ----------------
        DiaHelmMeta.setDisplayName("Diamond Helmet");
            // HelmLore
        List<String> Helmlore = new ArrayList<>();
        Helmlore.add("");
        Helmlore.add(ChatColor.RED + "Damage: " + ChatColor.GRAY + "1");
        Helmlore.add(ChatColor.GREEN + "Defense: " + ChatColor.GRAY + "13");
        Helmlore.add(ChatColor.BLUE + "Mana: " + ChatColor.GRAY + "15");
        Helmlore.add(ChatColor.GOLD + "Stamina: " + ChatColor.GRAY + "15");
        Helmlore.add("");
        Helmlore.add("The good ol' vanilla diamond armor!");
        Helmlore.add("");
        Helmlore.add(ChatColor.BLUE + "" + ChatColor.BOLD + "RARE");
        DiaHelmMeta.setLore(Helmlore);

        DiaHelm.setItemMeta(DiaHelmMeta);
        diaHelm = DiaHelm;
    }

    // ! Cac Chesplate
    private static void createDiaChestplate() {
        // DEFINE THE META -------------
        ItemStack DiaChest = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta DiaChestMeta = DiaChest.hasItemMeta() ? DiaChest.getItemMeta() : Bukkit.getItemFactory().getItemMeta(DiaChest.getType());


        // SET THE META ----------------
        DiaChestMeta.setDisplayName("Diamond Chestplate");
            // ChestLore
        List<String> Chestlore = b.addAttributes(DiaChest, 1, 0, 26, 23, 15, 15);
        Chestlore.add("");
        Chestlore.add(ChatColor.LIGHT_PURPLE + "The good ol' vanilla diamond armor!");
        Chestlore.add("");
        Chestlore.add(ChatColor.BLUE + "" + ChatColor.BOLD + "RARE");
        DiaChestMeta.setLore(Chestlore);

        // DIAMOND ARMOR META
        DiaChest.setItemMeta(DiaChestMeta);
        diaChes = DiaChest;
    }


    // ! Cac Leggings
    private static void createDiaLeggings() {
        // DEFINE THE META -------------
        ItemStack DiaLeg = new ItemStack(Material.DIAMOND_LEGGINGS);
        ItemMeta DiaLegMeta = DiaLeg.hasItemMeta() ? DiaLeg.getItemMeta() : Bukkit.getItemFactory().getItemMeta(DiaLeg.getType());


        // SET THE META ----------------
        DiaLegMeta.setDisplayName("Diamond Chestplate");
            // LegLore
        List<String> Leglore = new ArrayList<>();
        Leglore.add("");
        Leglore.add(ChatColor.BLUE + "Damage: " + ChatColor.GRAY + "1");
        Leglore.add(ChatColor.BLUE + "Defense: " + ChatColor.GRAY + "13");
        Leglore.add(ChatColor.BLUE + "Mana: " + ChatColor.GRAY + "15");
        Leglore.add(ChatColor.BLUE + "Stamina: " + ChatColor.GRAY + "15");
        Leglore.add("");
        Leglore.add(ChatColor.LIGHT_PURPLE + "The good ol' vanilla diamond armor!");
        Leglore.add("");
        Leglore.add(ChatColor.BLUE + "" + ChatColor.BOLD + "RARE");
        DiaLegMeta.setLore(Leglore);



        DiaLeg.setItemMeta(DiaLegMeta);
        diaLeg = DiaLeg;
    }
    // ! Cac Boots
    private static void createDiaBoots() {
        // DEFINE THE META -------------
        ItemStack DiaBoots = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta DiaBootsMeta = DiaBoots.hasItemMeta() ? DiaBoots.getItemMeta() : Bukkit.getItemFactory().getItemMeta(DiaBoots.getType());


        // SET THE META ----------------
        DiaBootsMeta.setDisplayName("Diamond Boots");
            // BootsLore
        List<String> Bootslore = new ArrayList<>();
        Bootslore.add("");
        Bootslore.add(ChatColor.BLUE + "Damage: " + ChatColor.GRAY + "1");
        Bootslore.add(ChatColor.BLUE + "Defense: " + ChatColor.GRAY + "8");
        Bootslore.add(ChatColor.BLUE + "Mana: " + ChatColor.GRAY + "7");
        Bootslore.add(ChatColor.BLUE + "Stamina: " + ChatColor.GRAY + "13");
        Bootslore.add("");
        Bootslore.add(ChatColor.LIGHT_PURPLE + "The good ol' vanilla diamond armor!");
        Bootslore.add("");
        Bootslore.add(ChatColor.BLUE + "" + ChatColor.BOLD + "RARE");
        DiaBootsMeta.setLore(Bootslore);


        DiaBoots.setItemMeta(DiaBootsMeta);
        diaBoots = DiaBoots;
    }
}