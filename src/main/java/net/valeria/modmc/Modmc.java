package net.valeria.modmc;

import net.fabricmc.api.ModInitializer;

import net.valeria.modmc.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Modmc implements ModInitializer {
	public static final String MOD_ID = "modmc";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}