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
	
	/**
	 * 
	 * Print useful information about a sellwand.
	 * Should be checked with {@link #isSellwand(ItemStack)} first.
	 * 
	 * @param Player
	 * @param ItemStack
	 */
	
	public void debugPrintSellwandInformation(Player p, ItemStack sellwand) {
		
	}

	/**
	 * 
	 * Get the amount of sellwand tokens a player has.
	 * 
	 * @param UUID
	 * @return int
	 */
	
	public int getPlayerTokens(UUID uuid) {
		return 0;
	}
	
	/**
	 * 
	 * Add sellwand tokens to a player.
	 * 
	 * @param UUID
	 * @param int
	 */
	
	public void addPlayerTokens(UUID uuid, int amount) {
		
	}
	
	/**
	 * 
	 * Take sellwand tokens from a player.
	 * 
	 * @param UUID
	 * @param int
	 */
	
	public void takePlayerTokens(UUID uuid, int amount) {

	}
	
	/**
	 * 
	 * Set the sellwand tokens of a player.
	 * 
	 * @param UUID
	 * @param int
	 */
	
	public void setPlayerTokens(UUID uuid, int amount) {

	}
	
	/**
	 * 
	 * Check if an ItemStack is a valid sellwand item.
	 * 
	 * @param ItemStack
	 * @return Boolean
	 */
	
	public Boolean isSellwand(ItemStack sellwand) {
		return null;
	}
	
	/**
	 * 
	 * Check if a String is valid sellwand tier.
	 * 
	 * @param String
	 * @return Boolean
	 */
	
	public Boolean isValidSellwandTier(String tier) {
		return null;
	}
	
	/**
	 * 
	 * Check if a String is a valid charger tier.
	 * 
	 * @param String
	 * @return Boolean
	 */
	
	public Boolean isValidChargerTier(String tier) {
		return null;
	}
	
	/**
	 * 
	 * Check if a String is a valid discharger.
	 * 
	 * @param String
	 * @return Boolean
	 */
	
	public Boolean isValidDischargerTier(String tier) {
		return null;
	}
	
	/**
	 * 
	 * Get the tier of a sellwand (as string) from a sellwand item.
	 * Should be checked with {@link #isSellwand(ItemStack)} first.
	 * This is the name that you would use in {@link #createSellWand(String, Double, int)} as the String argument.
	 * 
	 * @param ItemStack
	 * @return String
	 */
	
	public String getSellwandTier(ItemStack sellwand) {
		return null;
	}
	
	/**
	 * 
	 * Get the type name of a sellwand (as string) from a valid sellwand item.
	 * Should be checked with {@link #isSellwand(ItemStack)} first.
	 * The type name is the placeholder for the messages from when giving/receiving sellwands.
	 * 
	 * @param ItemStack
	 * @return String
	 */
	
	public String getSellwandTypeName(ItemStack sellwand) {
		return null;
	}
	
	/**
	 * 
	 * Check if an ItemStack is a valid charger item.
	 * 
	 * @param ItemStack
	 * @return Boolean
	 */
	
	public Boolean isCharger(ItemStack charger) {
		return null;
	}
	
	/**
	 * 
	 * Check if an ItemStack is a valid charger item.
	 * 
	 * @param ItemStack
	 * @return Boolean
	 */
	
	public Boolean isDischarger(ItemStack discharger) {
		return null;
	}
	
	/**
	 * 
	 * Get the tier of a charger (as string) from a charger item.
	 * Should be checked with {@link #isCharger(ItemStack)} first.
	 * This is the name that you would use in {@link #createSellwandCharger(String, int)} as the String argument.
	 * 
	 * @param ItemStack
	 * @return String
	 */
	
	public String getChargerTier(ItemStack charger) {
		return null;
	}
	
	/**
	 * 
	 * Get the tier of a discharger (as string) from a discharger item.
	 * Should be checked with {@link #isDischarger(ItemStack)} first.
	 * This is the name that you would use in {@link #createSellwandDischarger(String)} as the String argument.
	 * 
	 * @param ItemStack
	 * @return String
	 */
	
	public String getDischargerTier(ItemStack discharger) {
		return null;
	}
	
	/**
	 * 
	 * Get the uses of a sellwand item. 
	 * Should be checked with {@link #isSellwand(ItemStack)} first.
	 * Will return -1 if uses are infinite.
	 * 
	 * @param ItemStack
	 * @return int
	 */
	
	public int getUses(ItemStack sellwand) {
		return 0;
	}
	
	/**
	 * 
	 * Get the unique ID of a sellwand. 
	 * 
	 * @param ItemStack
	 * @return String
	 */
	
	public String getSellwandID(ItemStack sellwand) {
		return null;
	}
	
	/**
	 * 
	 * Get the amount of uses a charger would restore to a sellwand.
	 * Should be checked with {@link #isCharger(ItemStack)} first.
	 * 
	 * @param ItemStack
	 * @return int
	 */
	
	public int getChargerUses(ItemStack charger) {
		return 0;
	}

	/**
	 * 
	 * Get the total sold items amount statistic of a sellwand.
	 * Should be checked with {@link #isSellwand(ItemStack)} first.
	 * 
	 * @param ItemStack
	 * @return int
	 */
	
	public int getTotalAmountStatistic(ItemStack sellwand) {
		return 0;
	}
	
	/**
	 * 
	 * Get the total money statistic of a sellwand.
	 * Should be checked with {@link #isSellwand(ItemStack)} first.
	 * 
	 * @param ItemStack
	 * @return int
	 */
	
	public int getTotalMoneyStatistic(ItemStack sellwand) {
		return 0;
	}
	
	/**
	 * 
	 * Get the multiplier of a sellwand.
	 * Should be checked with {@link #isSellwand(ItemStack)} first.
	 * 
	 * @param ItemStack
	 * @return Double
	 */
	
	public Double getMultiplier(ItemStack sellwand) {
		return null;
	}

	/**
	 * 
	 * Check if a sellwand is bound to a player.
	 * Should be checked with {@link #isSellwand(ItemStack)} first.
	 * 
	 * @param ItemStack
	 * @return Boolean
	 */
	
	public Boolean isBoundToPlayer(ItemStack sellwand) {
		return null;
	}
	
	/**
	 * 
	 * If a sellwand is bound, get the username of the sellwand owner.
	 * Should be checked with {@link #isSellwand(ItemStack)} first.
	 * Don't use this, use the UUID method and fetch the username that way.
	 * 
	 * @param ItemStack
	 * @return String
	 */
	
	public String getSellwandOwnerName(ItemStack sellwand) {
		return null;
	}	
	
	/**
	 * 
	 * If a sellwand is bound, get the UUID of the sellwand owner.
	 * Should be checked with {@link #isSellwand(ItemStack)} first.
	 * 
	 * @param ItemStack
	 * @return String
	 */
	
	public String getSellwandOwnerUUID(ItemStack sellwand) {
		return null;
	}
	
	/**
	 * 
	 * Get the enchantment level of an enchantment on a sellwand.
	 * Should be checked with {@link #isSellwand(ItemStack)} first.
	 * Use the configuration key for the enchantment in enchantments.yml
	 * 
	 * @param ItemStack
	 * @param String
	 * @return int
	 */
	
	public int getSellwandEnchantmentLevel(ItemStack sellwand, String enchantmentName) {
		return 0;
	}
	
	/**
	 * 
	 * Create a sellwand (ItemStack).
	 * Set uses to -1 for infinite uses.
	 * Will throw null exception if the type is invalid.
	 * Any String that shows up in tab completion when using the command in-game is a valid type.
	 * 
	 * @param String
	 * @param Double
	 * @param int
	 * @return ItemStack
	 */
	
	public ItemStack createSellWand(String type, Double sellMultiplier, int uses) {
		return null;
	}
	
	/**
	 * 
	 * Create a sellwand charger (ItemStack).
	 * Will throw null exception if the type is invalid.
	 * Any String that shows up in tab completion when using the command in-game is a valid type.
	 * 
	 * @param String
	 * @param int
	 * @return ItemStack
	 */
	
	public ItemStack createSellwandCharger(String type, int uses) {
		return null;
	}
	
	/**
	 * 
	 * Create a sellwand discharger (ItemStack).
	 * Will throw null exception if the type is invalid.
	 * Any String that shows up in tab completion when using the command in-game is a valid type.
	 * 
	 * @param String
	 * @return ItemStack
	 */
	
	public ItemStack createSellwandDischarger(String type) {
		return null;
	}

}
