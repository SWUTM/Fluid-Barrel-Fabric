package net.swutm.fluidbarrel.item;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.swutm.fluidbarrel.fluidbarrel;

public class ModItems {
    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(fluidbarrel.MOD_ID, name), item);
    }

    public static void registerModItems() {
        fluidbarrel.LOGGER.info("1" + fluidbarrel.MOD_ID);
    }
}

