package tech.nully.primplug.formChnage;

import java.util.HashMap;
import java.util.List;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import tech.nully.primplug.fileSystem.file;

public class setSpells {
    private HashMap<String, List<String>> playerSpells = new HashMap<String, List<String>>();
    file s = new file();
    
    public void addPlayerSpells(Player p) {
        FileConfiguration playerConfig = s.getFileConfig(p.getDisplayName());
        List<String> playerSpell = s.readFile(playerConfig, "Spells");
    }

    public void addSpell(Player p, String spellName) {
        FileConfiguration file = s.getFileConfig(p.getDisplayName());

        List<String> newPlayerList = playerSpells.get(p.getDisplayName());
        newPlayerList.add(spellName);
        playerSpells.put(p.getDisplayName(), newPlayerList);

        s.addToFile(file, "Spells", spellName);
        
    }
}
