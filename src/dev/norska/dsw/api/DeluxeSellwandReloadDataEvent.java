package dev.norska.dsw.api;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class DeluxeSellwandReloadDataEvent extends Event implements Cancellable{

    private boolean isCancelled;

    public DeluxeSellwandReloadDataEvent() {
        this.isCancelled = false;
    }

    public boolean isCancelled() {
        return false;
    }

    public void setCancelled(boolean isCancelled) {
        
    }

    private static final HandlerList HANDLERS = new HandlerList();

    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

  
}
