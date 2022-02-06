package dev.norska.dsw.prices;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public interface DSWPriceHandlerInterface {
	
	Double getItemWorth(Player p, ItemStack item, int amount);

}
