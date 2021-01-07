package dev.norska.dsw.api;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

public class DeluxeSellwandInspectEvent extends Event implements Cancellable{

    private final Player player;
    private Double money;
    private boolean isCancelled;
    private int amount;
    private ItemStack sellwand;

    public DeluxeSellwandInspectEvent(Player player1, Double money1, int amount1, ItemStack sellwand1) {
        this.player = player1;
        this.money = money1;
        this.amount = amount1;
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
    
    public int getItemAmount() {
        return this.amount;
    }
    
    public Double getMoney() {
    	return this.money;
    }
    
    public ItemStack getSellwand() {
    	return this.sellwand;
    }
    
}
