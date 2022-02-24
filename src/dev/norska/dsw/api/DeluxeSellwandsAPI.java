package dev.norska.dsw.api;

import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import dev.norska.dsw.DeluxeSellwands;

public class DeluxeSellwandsAPI {
	
	public static void debugPrintSellwandInformation(Player p, ItemStack sellwand) {
		
	}
	
	public static int getPlayerTokens(UUID uuid) {
		return 0;
	}
	
	public static void addPlayerTokens(UUID uuid, int amount) {
		
	}
	
	public static void takePlayerTokens(UUID uuid, int amount) {

	}
	
	public static void setPlayerTokens(UUID uuid, int amount) {

	}
	
	public static Boolean isSellwand(ItemStack sellwand) {
		return null;
	}
	
	public static Boolean isValidSellwandTier(DeluxeSellwands instance, String tier) {
		return null;
	}
	
	public static Boolean isValidChargerTier(DeluxeSellwands instance, String tier) {
		return null;
	}
	
	public static String getSellwandTier(ItemStack sellwand) {
		return null;
	}
	
	public static String getSellwandTypeName(DeluxeSellwands instance, ItemStack sellwand) {
		return null;
	}
	
	public static Boolean isCharger(ItemStack charger) {
		return null;
	}
	
	public static String getChargerTier(DeluxeSellwands instance, ItemStack charger) {
		return null;
	}
	
	public static int getUses(ItemStack sellwand) {
		return 0;
	}
	
	public static String getSellwandID(ItemStack sellwand) {
		return null;
	}
	
	public static int getChargerUses(ItemStack charger) {
		return 0;
	}

	public static int getTotalAmountStatistic(ItemStack sellwand) {
		return 0;
	}
	
	public static int getTotalMoneyStatistic(ItemStack sellwand) {
		return 0;
	}
	
	public static Double getMultiplier(ItemStack sellwand) {
		return null;
	}

	// SELLWAND BINDING SECTION
	
	public static Boolean isBoundToPlayer(ItemStack item) {
		return null;
	}
	
	public static String getSellwandOwnerName(ItemStack item) {
		return null;
	}	
	
	public static String getSellwandOwnerUUID(ItemStack item) {
		return null;
	}
	
	public static int getSellwandEnchantmentLevel(ItemStack sellwand, String enchantmentName) {
		return 0;
	}
	
	public static ItemStack createSellWand(DeluxeSellwands instance, String type, Double sellMultiplier, int uses) {
		return null;
	}
	
	public static ItemStack createSellwandCharger(DeluxeSellwands instance, String type, int uses) {
		return null;
	}

}
