package dev.norska.dsw.api;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

public class DeluxeSellwandPreSellEvent extends Event implements Cancellable{

    private final Player player;
    private boolean isCancelled;
    private ItemStack sellwand;

    public DeluxeSellwandPreSellEvent(Player player1, ItemStack sellwand1) {
        this.player = player1;
        this.sellwand = sellwand1;
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
    
    public ItemStack getSellwand() {
    	return this.sellwand;
    }
    
}
