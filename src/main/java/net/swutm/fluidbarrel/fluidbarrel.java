package net.swutm.fluidbarrel;

import net.fabricmc.api.ModInitializer;
import net.swutm.fluidbarrel.block.ModBlocks;
import net.swutm.fluidbarrel.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class fluidbarrel implements ModInitializer {
	public static final String MOD_ID = "fluidbarrel";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
