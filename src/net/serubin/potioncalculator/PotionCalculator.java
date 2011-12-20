package net.serubin.potioncalculator;

import java.util.logging.Logger;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class PotionCalculator extends JavaPlugin{
	
	public static PotionCalculator plugin;
	public static Logger log = Logger.getLogger("Minecraft");
	private String name;
	private String version;
	
	
	@Override
	public void onDisable() {
		reloadConfig();
		saveConfig();
		log.info(name + " has been disabled");
	}
	
	public void onEnable() {

		version = this.getDescription().getVersion();
		name = this.getDescription().getName();
		
		PluginManager pm = getServer().getPluginManager();
		
		log.info(name + " version " + version + " has been enabled!");
	}

	//public enum potiontype {
		//regeneration, swiftness, fireresistance, poison, weakness, strength, slowness, harming
	//}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		if (commandLabel.equalsIgnoreCase("calc")){
			if (args[0].equalsIgnoreCase("splash")){
				
			}else{
				
				
				switch(args[0]){
				case 1: 
					break;
				case 2: 
					break;
				case 3: 
					break;
				case 4: 
					break;
				case 5: 
					break;
				case 8: 
					break;
				case 9: 
					break;
				case 10: 
					break;
				}
				switch(args[1]){
				case 1: 
					break;
				case 2: 
					break;
				}
				
			}
		}
		
		if(args.length == 0){
			
		}
        if(args.length == 2){
			String.parseString(args[0]);
		}
        if(args.length == 3){
			
		}
        if(args.length == 4){
			
		}
		return true;
	}
	
}
