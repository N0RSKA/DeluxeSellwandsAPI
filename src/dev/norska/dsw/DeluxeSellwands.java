package dev.norska.dsw;

import org.bukkit.plugin.java.JavaPlugin;

public class DeluxeSellwands extends JavaPlugin{
	
	private static DeluxeSellwands instance;
	
	 public DeluxeSellwands() {
	     instance = this;
	 }

	 public static DeluxeSellwands getInstance() {
	     return instance;
	 }
    
}
