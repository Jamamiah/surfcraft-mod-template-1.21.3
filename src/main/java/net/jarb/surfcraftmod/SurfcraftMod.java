package net.jarb.surfcraftmod;

import net.fabricmc.api.ModInitializer;

import net.jarb.surfcraftmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SurfcraftMod implements ModInitializer {
	public static final String MOD_ID = "surfcraft-mod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}