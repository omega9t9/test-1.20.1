package net.omegoat.test.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.omegoat.test.Test;

public class ModItems {
    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Test.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Test.LOGGER.info("Registering Mod items " + Test.MOD_ID);
    }
}
