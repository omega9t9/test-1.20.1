package net.omegoat.test;

import net.fabricmc.api.ModInitializer;

import net.omegoat.test.block.ModBlocks;
import net.omegoat.test.item.ModItemGroups;
import net.omegoat.test.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test implements ModInitializer {
	public static final String MOD_ID = "test";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItemGroups.reisterItemGroups();

        ModBlocks.registerModBlocks();
        ModItems.registerModItems();
	}
}