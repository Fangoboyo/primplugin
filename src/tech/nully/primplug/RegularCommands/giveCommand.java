package tech.nully.primplug.RegularCommands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import tech.nully.primplug.Armor.armorItems.Drakon;
import tech.nully.primplug.Armor.armorItems.PetheriteSet;
import tech.nully.primplug.Armor.armorItems.cactusArmor;
import tech.nully.primplug.Armor.armorItems.demigodArmor;
import tech.nully.primplug.Armor.armorItems.hardenedDiamond;
import tech.nully.primplug.Armor.armorItems.lapisArmor;
import tech.nully.primplug.Armor.armorItems.platedArmor;
import tech.nully.primplug.Talismans.Talisman;

public class giveCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can execute this command!");
            return true;
        }
        // Petherite helmet
        Player p = (Player) sender;
        if (!args[0].equals(null)) {
            switch (args[0]) {
                case "petheritehelm": p.getInventory().addItem(PetheriteSet.helm);
                sender.sendMessage(
                    ChatColor.YELLOW + 
                    "You gave yourself a" + 
                    ChatColor.LIGHT_PURPLE + 
                    //name
                    " Petherite Helmet" + 
                    ChatColor.YELLOW + 
                    "!");
                break;
                case "petheriteches": p.getInventory().addItem(PetheriteSet.ches);
                sender.sendMessage(
                    ChatColor.YELLOW + 
                    "You gave yourself a" + 
                    ChatColor.LIGHT_PURPLE + 
                    //name
                    " Petherite Chesplate" + 
                    ChatColor.YELLOW + 
                    "!");
                break;
                case "petheriteleg": p.getInventory().addItem(PetheriteSet.leg);
                sender.sendMessage(
                    ChatColor.YELLOW + 
                    "You gave yourself a pair of" + 
                    ChatColor.LIGHT_PURPLE + 
                    // name
                    " Petherite Leggings" + 
                    ChatColor.YELLOW + 
                    "!");
                break;
                case "petheriteboots": p.getInventory().addItem(PetheriteSet.boots);
                sender.sendMessage(
                    ChatColor.YELLOW + 
                    "You gave yourself a pair of" + 
                    ChatColor.LIGHT_PURPLE + 
                    // name
                    " Petherite Boots" + 
                    ChatColor.YELLOW + 
                    "!");
                break;
                // Talismans
                case "bod": p.getInventory().addItem(Talisman.BladeOfDespair);
                sender.sendMessage(
                    ChatColor.YELLOW + 
                    "You gave yourself a" + 
                    ChatColor.LIGHT_PURPLE + 
                    // name
                    " Curse of despair" + 
                    ChatColor.YELLOW + 
                    "Talisman!");
                break;
                case "blod": p.getInventory().addItem(Talisman.BlessingOfDurability);
                sender.sendMessage(
                    ChatColor.YELLOW + 
                    " You gave yourself a" + 
                    ChatColor.LIGHT_PURPLE + 
                    "Blessing of Durability" + 
                    ChatColor.YELLOW + 
                    "Talisman!");
                break;
                case "miso": p.getInventory().addItem(Talisman.MisoTheRabbit);
                sender.sendMessage(
                    ChatColor.YELLOW + 
                    "You gave yourself a" + 
                    ChatColor.LIGHT_PURPLE + 
                    " Miso the Rabbit" + 
                    ChatColor.YELLOW + 
                    "Talisman!");
                break;
                // Drakon
                case "drakonhelm": p.getInventory().addItem(Drakon.helm);
                sender.sendMessage(
                    ChatColor.YELLOW + 
                    "You gave yourself a" + 
                    ChatColor.LIGHT_PURPLE + 
                    " Drakon Helmet!" + 
                    ChatColor.YELLOW + 
                    "!");
                break;
                case "drakonches": p.getInventory().addItem(Drakon.ches);
                sender.sendMessage(
                    ChatColor.YELLOW + 
                    "You gave yourself a" + 
                    ChatColor.LIGHT_PURPLE + 
                    " Drakon Chestplate" + 
                    ChatColor.YELLOW + 
                    "!");
                break;
                case "drakonleg": p.getInventory().addItem(Drakon.leg);
                sender.sendMessage(
                    ChatColor.YELLOW + 
                    "You gave yourself a pair of" + 
                    ChatColor.LIGHT_PURPLE + 
                    " Drakon Leggings" + 
                    ChatColor.YELLOW + 
                    "!");
                break;
                case "drakonboots": p.getInventory().addItem(Drakon.boots);
                sender.sendMessage(
                    ChatColor.YELLOW + 
                    "You gave yourself a pair of" + 
                    ChatColor.LIGHT_PURPLE + 
                    " Drakon Boots" + 
                    ChatColor.YELLOW + 
                    "!");
                break;
                case "cachelm": p.getInventory().addItem(cactusArmor.helm);
                sender.sendMessage(
                    ChatColor.YELLOW + 
                    "You gave yourself a" + 
                    ChatColor.LIGHT_PURPLE + 
                    " Cactus Helmet" + 
                    ChatColor.YELLOW + 
                    "!");
                break;
                case "cacches": p.getInventory().addItem(cactusArmor.ches);
                sender.sendMessage(
                    ChatColor.YELLOW + 
                    "You gave yourself a" + 
                    ChatColor.LIGHT_PURPLE + 
                    " Cactus Chesplate" + 
                    ChatColor.YELLOW + 
                    "!");
                break;
                case "cacleg": p.getInventory().addItem(cactusArmor.leg);
                sender.sendMessage(
                    ChatColor.YELLOW + 
                    "You gave yourself a pair of" + 
                    ChatColor.LIGHT_PURPLE + 
                    " Cactus Leggings" + 
                    ChatColor.YELLOW + 
                    "!");
                break;
                case "cacboots": p.getInventory().addItem(cactusArmor.boots);
                sender.sendMessage(
                    ChatColor.YELLOW + 
                    "You gave yourself a" + 
                    ChatColor.LIGHT_PURPLE + 
                    " Phone" + 
                    ChatColor.YELLOW + 
                    "!");
                break;
                case "demihelm": p.getInventory().addItem(demigodArmor.helm);
                sender.sendMessage(
                    ChatColor.YELLOW + 
                    "You gave yourself a" + 
                    ChatColor.LIGHT_PURPLE + 
                    " Demigod Helmet" + 
                    ChatColor.YELLOW + 
                    "!");
                break;
                case "demiches": p.getInventory().addItem(demigodArmor.ches);
                sender.sendMessage(
                    ChatColor.YELLOW + 
                    "You gave yourself a" + 
                    ChatColor.LIGHT_PURPLE + 
                    " Demigod Chesplate" + 
                    ChatColor.YELLOW + 
                    "!");
                break;
                case "demileg": p.getInventory().addItem(demigodArmor.leg);
                sender.sendMessage(
                    ChatColor.YELLOW + 
                    "You gave yourself a pair of" + 
                    ChatColor.LIGHT_PURPLE + 
                    " Demigod Leggings" + 
                    ChatColor.YELLOW + 
                    "!");
                break;
                case "demiboots": p.getInventory().addItem(demigodArmor.boots);
                sender.sendMessage(
                    ChatColor.YELLOW + 
                    "You gave yourself a pair of" + 
                    ChatColor.LIGHT_PURPLE + 
                    " Demigod Boots" + 
                    ChatColor.YELLOW + 
                    "!");
                break;
                case "hardenedhelm": p.getInventory().addItem(hardenedDiamond.helm);
                sender.sendMessage(
                    ChatColor.YELLOW + 
                    "You gave yourself a" + 
                    ChatColor.LIGHT_PURPLE + 
                    " Hardened Diamond Helmet" + 
                    ChatColor.YELLOW + 
                    "!");
                break;
                case "hardenedches": p.getInventory().addItem(hardenedDiamond.ches);
                sender.sendMessage(
                    ChatColor.YELLOW + 
                    "You gave yourself a" + 
                    ChatColor.LIGHT_PURPLE + 
                    " Hardened Diamond Chesplate" + 
                    ChatColor.YELLOW + 
                    "!");
                break;
                case "hardenedleg": p.getInventory().addItem(hardenedDiamond.leg);
                sender.sendMessage(
                    ChatColor.YELLOW + 
                    "You gave yourself a pair of" + 
                    ChatColor.LIGHT_PURPLE + 
                    " Hardened Diamond Leggings" + 
                    ChatColor.YELLOW + 
                    "!");
                break;
                case "hardenedboots": p.getInventory().addItem(hardenedDiamond.boots);
                sender.sendMessage(
                    ChatColor.YELLOW + 
                    "You gave yourself a pair of" + 
                    ChatColor.LIGHT_PURPLE + 
                    " Hardened Diamond boots" + 
                    ChatColor.YELLOW + 
                    "!");
                break;
                case "lapishelm": p.getInventory().addItem(lapisArmor.helm);
                sender.sendMessage(
                    ChatColor.YELLOW + 
                    "You gave yourself a" + 
                    ChatColor.LIGHT_PURPLE + 
                    " Lapis Helmet" + 
                    ChatColor.YELLOW + 
                    "!");
                break;
                case "lapisches": p.getInventory().addItem(lapisArmor.chestplate);
                sender.sendMessage(
                    ChatColor.YELLOW + 
                    "You gave yourself a" + 
                    ChatColor.LIGHT_PURPLE + 
                    " Lapis Chesplate" + 
                    ChatColor.YELLOW + 
                    "!");
                break;
                case "lapisleg": p.getInventory().addItem(lapisArmor.leg);
                sender.sendMessage(
                    ChatColor.YELLOW + 
                    "You gave yourself a pair of" + 
                    ChatColor.LIGHT_PURPLE + 
                    " Lapis Leggings" + 
                    ChatColor.YELLOW + 
                    "!");
                break;
                case "lapisboots": p.getInventory().addItem(lapisArmor.boots);
                sender.sendMessage(
                    ChatColor.YELLOW + 
                    "You gave yourself a pair of" + 
                    ChatColor.LIGHT_PURPLE + 
                    " Lapis Boots" + 
                    ChatColor.YELLOW + 
                    "!");
                break;
                case "platedhelm": p.getInventory().addItem(platedArmor.helm);
                sender.sendMessage(
                    ChatColor.YELLOW + 
                    "You gave yourself a" + 
                    ChatColor.LIGHT_PURPLE + 
                    " Plated Iron Helmet" + 
                    ChatColor.YELLOW + 
                    "!");
                break;
                case "platedches": p.getInventory().addItem(platedArmor.chestplate);
                sender.sendMessage(
                    ChatColor.YELLOW + 
                    "You gave yourself a" + 
                    ChatColor.LIGHT_PURPLE + 
                    " Plated Iron Chesplate" + 
                    ChatColor.YELLOW + 
                    "!");
                break;
                case "platedleg": p.getInventory().addItem(platedArmor.leg);
                sender.sendMessage(
                    ChatColor.YELLOW + 
                    "You gave yourself a pair of" + 
                    ChatColor.LIGHT_PURPLE + 
                    " Plated Iron Leggings" + 
                    ChatColor.YELLOW + 
                    "!");
                break;
                case "platedboots": p.getInventory().addItem(platedArmor.boots);
                sender.sendMessage(
                    ChatColor.YELLOW + 
                    "You gave yourself a pair of" + 
                    ChatColor.LIGHT_PURPLE + 
                    " Plated Iron Boots" + 
                    ChatColor.YELLOW + 
                    "!");
                break;
            }
        } else {
            sender.sendMessage(ChatColor.RED + "Please enter a valid item to give");
        }
    return true;
    }
}
