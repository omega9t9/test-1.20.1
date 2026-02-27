package net.omegoat.test.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.omegoat.test.Test;
import net.omegoat.test.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup PINK_GARNET_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Test.MOD_ID, "pink_garnet_items"),
            FabricItemGroup.builder()
                    .icon(() ->new ItemStack(ModItems.PINK_GARNET))
                    .displayName(Text.translatable("itemgroup.test.pink_garnet_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.RAW_PINK_GARNET);
                        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
                    })
                    .build());
    public static void reisterItemGroups() {
        Test.LOGGER.info("Registering mod  item group" + Test.MOD_ID);
    }
}
