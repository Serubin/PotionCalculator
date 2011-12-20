package net.serubin.potioncalculator.util;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class PotionsInfo {

	Player player;
	
	public void potioninfo () {
		player.sendMessage(ChatColor.GREEN + potion + ":" + potiondisc + ChatColor.GREEN + " Id: " + potionId);
	}
	
	public void Ptype () {
		int regeneration = 1;
		int swiftness = 2;
		int fireresistance = 3;
		int poison = 4;
		int healing = 5;
		int weakness = 8;
		int strength = 9;
		int slowness = 10;
		int harming = 12;
		
	}
	
}
