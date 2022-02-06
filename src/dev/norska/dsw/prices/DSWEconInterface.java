package dev.norska.dsw.prices;

import org.bukkit.entity.Player;

public interface DSWEconInterface {
	
	void take(Player p, Double amount);
	
	void add(Player p, Double amount);
	
	void set(Player p, Double amount);
	
	void take(Player p, Integer amount);
	
	void add(Player p, Integer amount);
	
	void set(Player p, Integer amount);

	String currencyString();
	
	int currencyFormat();

}
