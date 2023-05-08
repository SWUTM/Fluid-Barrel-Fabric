package net.swutm.fluidbarrel.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.swutm.fluidbarrel.fluidbarrel;

public class ModBlocks {

    public static final Block EMPTY_IRON_BARREL = registerBlock("empty_iron_barrel",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().resistance(100000000f)), ItemGroup.BUILDING_BLOCKS);

    public static final Block WATER_IRON_BARREL = registerBlock("water_iron_barrel",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().resistance(100000000f)), ItemGroup.BUILDING_BLOCKS);

    public static final Block LAVA_IRON_BARREL = registerBlock("lava_iron_barrel",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().resistance(100000000f)), ItemGroup.BUILDING_BLOCKS);








    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(fluidbarrel.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(fluidbarrel.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        fluidbarrel.LOGGER.debug("Registering ModBlocks for " + fluidbarrel.MOD_ID);
    }
}
