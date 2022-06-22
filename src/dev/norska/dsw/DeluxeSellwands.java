package dev.norska.dsw;

import org.bukkit.plugin.java.JavaPlugin;

import dev.norska.dsw.prices.DSWEconInterfaceManager;
import dev.norska.dsw.prices.DSWPriceHandlerInterfaceManager;
import lombok.Getter;

public class DeluxeSellwands extends JavaPlugin{
	
	private static DeluxeSellwands instance;
	public DeluxeSellwands() { instance = this; }
	public static DeluxeSellwands getInstance() { return instance; }
    	 
	@Getter private DSWEconInterfaceManager econProvider = new DSWEconInterfaceManager();
	@Getter private DSWPriceHandlerInterfaceManager priceHandler = new DSWPriceHandlerInterfaceManager();
}
