package dev.norska.dsw.prices;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;

public class DSWEconInterfaceManager {
	
	@Getter private final Map<String, DSWEconInterface> economyMap = new HashMap<>();

    public void registerNewProvider(String identifier, DSWEconInterface DSWEconInterface) {
    	economyMap.put(identifier, DSWEconInterface);
    }

}
