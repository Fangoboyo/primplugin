package tech.nully.primplug.Armor.armorItems;


import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import tech.nully.primplug.Armor.baseAttributesAdder;

public class Drakon {

    public static ItemStack helm;
    public static ItemStack ches;
    public static ItemStack leg;
    public static ItemStack boots;

    public static void init() {
        createDrakonHelm();
        createDrakonChestplate();
        createDrakonLeggings();
        createDrakonBoots();
    }

    private static baseAttributesAdder a = new baseAttributesAdder();


    private static void createDrakonHelm() {
        // DEFINE THE META -------------
        ItemStack DRHelm = new ItemStack(Material.LEATHER_HELMET);
        ItemMeta DRHelmMeta = DRHelm.hasItemMeta() ? DRHelm.getItemMeta() : Bukkit.getItemFactory().getItemMeta(DRHelm.getType());


        // SET THE META ----------------
        DRHelmMeta.setDisplayName(ChatColor.DARK_PURPLE + "Drakon Helmet");
            // HelmLore
        List<String> Helmlore = a.addAttributes(DRHelm, 2, 2, 16, 13, 7, 15);
        Helmlore.add("");
        Helmlore.add("");
        Helmlore.add(a.ability() + "Set Bonus: DRAGON AWAKENING");
        Helmlore.add(ChatColor.GRAY + "Grants the wearer permanent +10 damage");
        Helmlore.add(ChatColor.GRAY + "and +45 Max Stamina");
        Helmlore.add("");
        Helmlore.add(ChatColor.GRAY + "" +ChatColor.ITALIC + "A helmet forged from the bones of");
        Helmlore.add(ChatColor.GRAY + "" +ChatColor.ITALIC + "the invincible dragon who guards the");
        Helmlore.add(ChatColor.GRAY + "" +ChatColor.ITALIC + "golden fleece...");
        Helmlore.add("");
        Helmlore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "EPIC");
        DRHelmMeta.setLore(Helmlore);

        // LEATHER ARMOR META
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) DRHelmMeta;
        leatherArmorMeta.setColor(Color.WHITE);


        DRHelm.setItemMeta(DRHelmMeta);
        helm = DRHelm;
    }


    private static void createDrakonChestplate() {
        // DEFINE THE META -------------
        ItemStack DRches = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta DRchesMeta = DRches.hasItemMeta() ? DRches.getItemMeta() : Bukkit.getItemFactory().getItemMeta(DRches.getType());


        // SET THE META ----------------
        DRchesMeta.setDisplayName(ChatColor.DARK_PURPLE + "Drakon Chesplate");
            // chesLore
        List<String> cheslore = a.addAttributes(DRches, 5, 4, 35, 32, 13, 25);
        cheslore.add("");
        cheslore.add(a.ability() + "Full Set Bonus: DRAGON AWAKENING");
        cheslore.add(ChatColor.GRAY + "Grants the wearer permanent +10 damage");
        cheslore.add(ChatColor.GRAY + "and +45 Max Stamina");
        cheslore.add("");
        cheslore.add(ChatColor.GRAY + "" +ChatColor.ITALIC + "A chesplate forged from the bones of");
        cheslore.add(ChatColor.GRAY + "" +ChatColor.ITALIC + "the invincible dragon who guards the");
        cheslore.add(ChatColor.GRAY + "" +ChatColor.ITALIC + "golden fleece...");
        cheslore.add("");
        cheslore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "EPIC");
        DRchesMeta.setLore(cheslore);

        // LEATHER ARMOR META
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) DRchesMeta;
        leatherArmorMeta.setColor(Color.WHITE);


        DRches.setItemMeta(DRchesMeta);
        ches = DRches;
    }

    private static void createDrakonLeggings() {
        // DEFINE THE META -------------
        ItemStack DRleg = new ItemStack(Material.LEATHER_LEGGINGS);
        ItemMeta DRlegMeta = DRleg.hasItemMeta() ? DRleg.getItemMeta() : Bukkit.getItemFactory().getItemMeta(DRleg.getType());


        // SET THE META ----------------
        DRlegMeta.setDisplayName(ChatColor.DARK_PURPLE + "Drakon Leggings");
            // legLore
        List<String> leglore = a.addAttributes(DRleg, 4, 3, 25, 22, 10, 20);
        leglore.add("");
        leglore.add(ChatColor.YELLOW + "" +ChatColor.BOLD + "PASSIVE SET BONUS: DRAGON AWAKENING");
        leglore.add(ChatColor.GRAY + "Grants the wearer permanent +10 damage");
        leglore.add(ChatColor.GRAY + "and +45 Max Stamina");
        leglore.add("");
        leglore.add(a.lore() + "A pair of Leggings forged from the bones");
        leglore.add(a.lore() + "of the invincible dragon who guards the");
        leglore.add(a.lore() + "golden fleece...");
        leglore.add("-Z");
        leglore.add("");
        leglore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "EPIC");
        DRlegMeta.setLore(leglore);

        // LEATHER ARMOR META
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) DRlegMeta;
        leatherArmorMeta.setColor(Color.WHITE);


        DRleg.setItemMeta(DRlegMeta);
        leg = DRleg;
    }


    private static void createDrakonBoots() {
        // DEFINE THE META -------------
        ItemStack DRboots = new ItemStack(Material.LEATHER_BOOTS);
        ItemMeta DRbootsMeta = DRboots.hasItemMeta() ? DRboots.getItemMeta() : Bukkit.getItemFactory().getItemMeta(DRboots.getType());


        // SET THE META ----------------
        DRbootsMeta.setDisplayName(ChatColor.DARK_PURPLE  + " Drakon Boots");
            // bootsLore
        List<String> bootslore = a.addAttributes(DRboots, 2, 1, 14, 10, 7, 15);
        bootslore.add("");
        bootslore.add(ChatColor.YELLOW + "" +ChatColor.BOLD + "PASSIVE SET BONUS: DRAGON AWAKENING");
        bootslore.add(ChatColor.GRAY + "Grants the wearer permanent +10 damage");
        bootslore.add(ChatColor.GRAY + "and +45 Max Stamina");
        bootslore.add("");
        bootslore.add(ChatColor.GRAY + "" +ChatColor.ITALIC + "A pair of boots forged from the bones");
        bootslore.add(ChatColor.GRAY + "" +ChatColor.ITALIC + "of the invincible dragon who guards the");
        bootslore.add(ChatColor.GRAY + "" +ChatColor.ITALIC + "golden fleece...");
        bootslore.add("");
        bootslore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "EPIC");
        DRbootsMeta.setLore(bootslore);

        // LEATHER ARMOR META
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) DRbootsMeta;
        leatherArmorMeta.setColor(Color.WHITE);


        DRboots.setItemMeta(DRbootsMeta);
        boots = DRboots;
    }
}