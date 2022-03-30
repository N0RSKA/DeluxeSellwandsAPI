package dev.norska.dsw.api;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

public class DeluxeSellwandTokenReceiveEvent extends Event implements Cancellable{

    private final Player player;
    private boolean isCancelled;
    private int tokens;
    private Block block;
    private ItemStack sellwand;

    public DeluxeSellwandTokenReceiveEvent(Player player1, int tokens1, ItemStack sellwand1, Block block1) {
        this.player = player1;
        this.tokens = tokens1;
        this.sellwand = sellwand1;
        this.block = block1;
        this.isCancelled = false;
    }

    public boolean isCancelled() {
        return this.isCancelled;
    }

    public void setCancelled(boolean isCancelled) {
        this.isCancelled = isCancelled;
    }

    private static final HandlerList HANDLERS = new HandlerList();

    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public Player getPlayer() {
        return this.player;
    }
    
    public int getTokens() {
        return this.tokens;
    }
    
    public void setTokens(int amount) {
    	tokens = amount;
    }
    
    public ItemStack getSellwand() {
    	return this.sellwand;
    }
    
    public Block getContainerBlock() {
    	return this.block;
    }
    
}
