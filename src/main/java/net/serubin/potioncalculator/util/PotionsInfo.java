package net.serubin.potioncalculator.util;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PotionsInfo {

	
	//public void potioninfo () {
		//player.sendMessage(ChatColor.GREEN + potion + ":" + potiondisc + ChatColor.GREEN + " Id: " + potionId);
	//}
	

	public static void pTypeError (CommandSender sender, Command cmd,
			String commandLabel, String[] args, Player player) {
		
		player.sendMessage(ChatColor.DARK_GREEN + "Potion Type: " + ChatColor.RED
				+ "Invalid Argument"
				+ ChatColor.WHITE + " '" + args[0] + "' "
				+ ChatColor.RED
				+ ChatColor.GREEN + "Try one of the following:");
		player.sendMessage(ChatColor.GREEN + ">> " + ChatColor.WHITE
				+ "splash");
		player.sendMessage(ChatColor.GREEN + ">> " + ChatColor.WHITE
				+ "regeneratoin");
		player.sendMessage(ChatColor.GREEN + ">> " + ChatColor.WHITE
				+ "swiftness");
		player.sendMessage(ChatColor.GREEN + ">> " + ChatColor.WHITE
				+ "poison");
		player.sendMessage(ChatColor.GREEN + ">> " + ChatColor.WHITE
				+ "healing");
		player.sendMessage(ChatColor.GREEN + ">> " + ChatColor.WHITE
				+ "weekness");
		player.sendMessage(ChatColor.GREEN + ">> " + ChatColor.WHITE
				+ "strength");
		player.sendMessage(ChatColor.GREEN + ">> " + ChatColor.WHITE
				+ "slowness");
		player.sendMessage(ChatColor.GREEN + ">> " + ChatColor.WHITE
				+ "harming");
	}
	
	public static void pTypeErrorS (CommandSender sender, Command cmd,
			String commandLabel, String[] args, Player player) {
		
		player.sendMessage(ChatColor.DARK_GREEN + "Potion Type: " + ChatColor.RED
				+ "Invalid Argument"
				+ ChatColor.WHITE + " '" + args[1] + "' "
				+ ChatColor.RED
				+ ChatColor.GREEN + "Try one of the following:");
		player.sendMessage(ChatColor.GREEN + ">> " + ChatColor.WHITE
				+ "splash");
		player.sendMessage(ChatColor.GREEN + ">> " + ChatColor.WHITE
				+ "regeneratoin");
		player.sendMessage(ChatColor.GREEN + ">> " + ChatColor.WHITE
				+ "swiftness");
		player.sendMessage(ChatColor.GREEN + ">> " + ChatColor.WHITE
				+ "poison");
		player.sendMessage(ChatColor.GREEN + ">> " + ChatColor.WHITE
				+ "healing");
		player.sendMessage(ChatColor.GREEN + ">> " + ChatColor.WHITE
				+ "weekness");
		player.sendMessage(ChatColor.GREEN + ">> " + ChatColor.WHITE
				+ "strength");
		player.sendMessage(ChatColor.GREEN + ">> " + ChatColor.WHITE
				+ "slowness");
		player.sendMessage(ChatColor.GREEN + ">> " + ChatColor.WHITE
				+ "harming");
	}
	
	public static void noArgError (CommandSender sender, Command cmd,
			String commandLabel, String[] args, Player player){
		
		player.sendMessage(ChatColor.GREEN + "Use /calc [splash] <potion type> <boost>");
	}
	/*
	 * public void potionId (CommandSender sender, Command cmd, String
	 * commandLabel, String[] args, Player player){
	 * player.sendMessage(ChatColor.GREEN + potionMessage); }
	 */
}
