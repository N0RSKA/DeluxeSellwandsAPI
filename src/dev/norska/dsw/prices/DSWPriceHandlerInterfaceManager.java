package dev.norska.dsw.prices;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;

public class DSWPriceHandlerInterfaceManager {
	
	@Getter private final Map<String, DSWPriceHandlerInterface> priceHandlerMap = new HashMap<>();

    public void registerNewPriceHandler(String identifier, DSWPriceHandlerInterface priceHandler) {
    	priceHandlerMap.put(identifier, priceHandler);
    }

}
