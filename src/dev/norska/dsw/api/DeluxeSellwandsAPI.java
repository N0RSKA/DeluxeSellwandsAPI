package dev.norska.dsw.api;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dev.norska.dsw.DeluxeSellwands;

public class DeluxeSellwandsAPI {
	
	public static Boolean isSellwand(ItemStack sellwand) {
		return null;
	}
	
	public static int getUses(ItemStack sellwand) {
		return 0;
	}
	
	public static ItemStack setUses(ItemStack sellwand, int uses) {
		return null;
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
	
	public static Boolean isConfirmDropEnabled() {
		return null;
	}
	
	public static int getConfirmDropInterval() {
		return 0;
	}
	
	public static ItemStack createCustomModelSellWand(DeluxeSellwands instance, Material material, int materialData, int customModelData, Double sellMultiplier, int uses, Boolean glow) {
		return null;
	}
	
	public static ItemStack createSellWand(DeluxeSellwands instance, Material material, int materialData, Double sellMultiplier, int uses, Boolean glow) {
		return null;
	}

}
