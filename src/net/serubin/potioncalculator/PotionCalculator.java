package net.serubin.potioncalculator;

import java.util.logging.Logger;

import net.serubin.potioncalculator.util.HashMaps;
import net.serubin.potioncalculator.util.PotionsInfo;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class PotionCalculator extends JavaPlugin {

	public static PotionCalculator plugin;
	public static Logger log = Logger.getLogger("Minecraft");
	private String name;
	private String version;
	PotionsInfo pInfo;

	int boost;
	int splash;
	int effect;

	@Override
	public void onDisable() {
		log.info(name + " has been disabled");
	}

	@Override
	public void onEnable() {

		version = this.getDescription().getVersion();
		name = this.getDescription().getName();

		PluginManager pm = getServer().getPluginManager();
		// info = new PotionsInfo(player);

		HashMaps.setEffect();
		HashMaps.setBoost();
		PotionsInfo pInfo = new PotionsInfo();
		log.info(name + " version " + version + " has been enabled!");
	}

	public boolean onCommand(CommandSender sender, Command cmd,
			String commandLabel, String[] args) {
		Player player = (Player) sender;
		if (commandLabel.equalsIgnoreCase("potion")) {
			splash = 0;
			if (args.length == 0) {
				PotionsInfo.noArgError(sender, cmd, commandLabel, args, player);
			} else {
				if (args[0].equalsIgnoreCase("splash")) {

					splash = 128 + 16384;
					splash(sender, cmd, commandLabel, args, player);

				}
				else {
					nosplash(sender, cmd, commandLabel, args, player);
				}

			}
		}
		return true;

	}

	boolean nosplash(CommandSender sender, Command cmd, String commandLabel,
			String[] args, Player player) {

		if (HashMaps.effect.containsKey(args[0].toLowerCase())) {
			effect = HashMaps.effect.get(args[0].toLowerCase());
			player.sendMessage("effect " + args[1] + effect);
		} else {
			PotionsInfo.pTypeError(sender, cmd, commandLabel, args, player);
		}
		if (args.length == 3) {
			if (HashMaps.boost.containsKey(args[1].toLowerCase())) {
				boost = HashMaps.boost.get(args[1].toLowerCase());
				player.sendMessage("boost " + args[1] + boost);
			} else {
				player.sendMessage("boost " + args[1] + boost);
				return false;
			}
		}
		if (args.length == 2) {
			boost = 0;
		}

		return true;
	}

	boolean splash(CommandSender sender, Command cmd, String commandLabel,
			String[] args, Player player) {

		if (HashMaps.effect.containsKey(args[1].toLowerCase())) {
			effect = HashMaps.effect.get(args[1].toLowerCase());
			player.sendMessage("effect " + args[1] + effect);
		} else {
			PotionsInfo.pTypeErrorS(sender, cmd, commandLabel, args, player);
		}
		if (args.length == 3) {
			if (HashMaps.boost.containsKey(args[2].toLowerCase())) {
				boost = HashMaps.boost.get(args[2].toLowerCase());
				player.sendMessage("boost " + args[2] + boost);
			} else {
				player.sendMessage("boost " + args[1] + boost);
				return false;
			}
		}
		if (args.length == 2) {
			boost = 0;
		}

		return true;
	}

}