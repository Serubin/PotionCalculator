package net.serubin.potioncalculator.util;

import java.util.HashMap;

public class HashMaps {

	public static HashMap<String, Integer> effect = new HashMap<String, Integer>();
	public static HashMap<String, Integer> boost = new HashMap<String, Integer>();
	
	public static void setEffect() {
		effect.put("regeneration", 1);
		effect.put("swiftness", 2);
		effect.put("fireresistace", 3);
		effect.put("fire", 3);
		effect.put("posion", 4);
		effect.put("healing", 5);
		effect.put("weakness", 8);
		effect.put("strength", 9);
		effect.put("slowness", 10);
		effect.put("harming", 12);
	}
	
	public static void setBoost() {
		boost.put("redstone", 32);
		boost.put("glowstone", 64);
	}
}
