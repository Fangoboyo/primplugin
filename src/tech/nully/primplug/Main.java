package tech.nully.primplug;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import tech.nully.primplug.Armor.armorItems.*;
import tech.nully.primplug.Listeners.armorPutOnEvent;
import tech.nully.primplug.Listeners.playerDamageListener;
import tech.nully.primplug.Listeners.playerJoinListener;
import tech.nully.primplug.Listeners.upgradeGUIListener;
import tech.nully.primplug.RPGcommands.reforges.reforgeCommand;
import tech.nully.primplug.RegularCommands.giveCommand;
import tech.nully.primplug.RegularCommands.glowCommand;
import tech.nully.primplug.Talismans.Talisman;
import tech.nully.primplug.Talismans.talismanListeners;
import tech.nully.primplug.Tools.bloodThirstyBlade;
import tech.nully.primplug.Tools.toolAbilities;
import tech.nully.primplug.Tools.zeusBolt;
import tech.nully.primplug.crafting.customRecipes.armorRecipes;
import tech.nully.primplug.crafting.overridenRecipes.overridenRecipeItems;
import tech.nully.primplug.crafting.overridenRecipes.overridenRecipes;
import tech.nully.primplug.enchantStuff.EnchantGUI;
import tech.nully.primplug.enchantStuff.enchantMechanic;
import tech.nully.primplug.enchantStuff.registerGlow;
import tech.nully.primplug.playerStatManagers.manaManager.passiveManaAdder;
import tech.nully.primplug.recipeBook.recipeCommand;
import tech.nully.primplug.rightClickPlayerMechanic.rightClickPlayer;
import tech.nully.primplug.upgradeItems.upgradeCommand;

public class Main extends JavaPlugin {
    private static Main instance;
    passiveManaAdder p = new passiveManaAdder();

    public static Main getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;

        PetheriteSet.init();
        Talisman.init();
        Drakon.init();
        baseMethods.init();
        cactusArmor.init();
        demigodArmor.init();
        hardenedDiamond.init();
        lapisArmor.init();
        platedArmor.init();
        reaperArmor.init();
        overridenRecipeItems.init();

        bloodThirstyBlade.makeBloodThirstyBlade();
        zeusBolt.createZeusBolt();

        registerGlow.registerGlow();

        overridenRecipes.overrideRecipes();

        p.addMana();
        enchantMechanic.createEnchantHashMap();
        EnchantGUI.init();
        
        
        // recipes
        armorRecipes.init();



        getServer().getPluginManager().registerEvents(new upgradeGUIListener(), this);
        getServer().getPluginManager().registerEvents(new playerDamageListener(), this);
        getServer().getPluginManager().registerEvents(new rightClickPlayer(), this);
        getServer().getPluginManager().registerEvents(new talismanListeners(), this);
        getServer().getPluginManager().registerEvents(new toolAbilities(), this);
        getServer().getPluginManager().registerEvents(new armorPutOnEvent(), this);
        getServer().getPluginManager().registerEvents(new playerJoinListener(), this);

        getCommand("recipes").setExecutor(new recipeCommand());
        getCommand("glow").setExecutor(new glowCommand());
        getCommand("pgive").setExecutor(new giveCommand());
        getCommand("reforge").setExecutor(new reforgeCommand());
        getCommand("upgrade").setExecutor(new upgradeCommand());


        getServer().getConsoleSender().sendMessage("--------------------------------------------");
        getServer().getConsoleSender().sendMessage("--------------------------------------------");
        getServer().getConsoleSender().sendMessage(
        ChatColor.LIGHT_PURPLE + "[PrimPlugin]" + ChatColor.GREEN + " PrimPlugin V0.2.6 is now Enabled! :D");
        getServer().getConsoleSender().sendMessage("--------------------------------------------");
        getServer().getConsoleSender().sendMessage("--------------------------------------------");
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(
            ChatColor.LIGHT_PURPLE + "[PrimPlugin]" + ChatColor.RED + "PrimPlugin is now Disabled! :(");
    }
}