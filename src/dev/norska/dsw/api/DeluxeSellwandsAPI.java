package dev.norska.dsw.api;

import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import dev.norska.dsw.DeluxeSellwands;

public class DeluxeSellwandsAPI {
	
	private DeluxeSellwands instance;
	public DeluxeSellwandsAPI(DeluxeSellwands instance) {
	   this.instance = instance;
	} 
	
	public void debugPrintSellwandInformation(Player p, ItemStack sellwand) {
		
	}
	
	public int getPlayerTokens(UUID uuid) {
		return 0;
	}
	
	public void addPlayerTokens(UUID uuid, int amount) {
		
	}
	
	public void takePlayerTokens(UUID uuid, int amount) {

	}
	
	public void setPlayerTokens(UUID uuid, int amount) {

	}
	
	public Boolean isSellwand(ItemStack sellwand) {
		return null;
	}
	
	public Boolean isValidSellwandTier(String tier) {
		return null;
	}
	
	public Boolean isValidChargerTier(String tier) {
		return null;
	}
	
	public Boolean isValidDischargerTier(String tier) {
		return null;
	}
	
	public String getSellwandTier(ItemStack sellwand) {
		return null;
	}
	
	public String getSellwandTypeName(ItemStack sellwand) {
		return null;
	}
	
	public Boolean isCharger(ItemStack charger) {
		return null;
	}
	
	public Boolean isDischarger(ItemStack charger) {
		return null;
	}
	
	public String getChargerTier(ItemStack charger) {
		return null;
	}
	
	public String getDischargerTier(ItemStack charger) {
		return null;
	}
	
	public int getUses(ItemStack sellwand) {
		return 0;
	}
	
	public String getSellwandID(ItemStack sellwand) {
		return null;
	}
	
	public int getChargerUses(ItemStack charger) {
		return 0;
	}

	public int getTotalAmountStatistic(ItemStack sellwand) {
		return 0;
	}
	
	public int getTotalMoneyStatistic(ItemStack sellwand) {
		return 0;
	}
	
	public Double getMultiplier(ItemStack sellwand) {
		return null;
	}

	// SELLWAND BINDING SECTION
	
	public Boolean isBoundToPlayer(ItemStack item) {
		return null;
	}
	
	public String getSellwandOwnerName(ItemStack item) {
		return null;
	}	
	
	public String getSellwandOwnerUUID(ItemStack item) {
		return null;
	}
	
	public int getSellwandEnchantmentLevel(ItemStack sellwand, String enchantmentName) {
		return 0;
	}
	
	public ItemStack createSellWand(String type, Double sellMultiplier, int uses) {
		return null;
	}
	
	public ItemStack createSellwandCharger(String type, int uses) {
		return null;
	}

}
