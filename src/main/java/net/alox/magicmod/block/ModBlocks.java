package net.alox.magicmod.block;

import net.alox.magicmod.MagicMod;
import net.alox.magicmod.block.custom.river_plant;
import net.alox.magicmod.item.ModCreativeModeTab;
import net.alox.magicmod.item.ModItems;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MagicMod.MODID);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    public static final RegistryObject<Block> LAVENDER = registerBlock("lavender",
            () -> new FlowerBlock(MobEffects.LEVITATION, 5,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)), ModCreativeModeTab.BASIC_TAB);
    public static final RegistryObject<Block> POTTED_LAVENDER = BLOCKS.register("potted_lavender",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.LAVENDER,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM)));

    public static final RegistryObject<Block> ROSEMARY = registerBlock("rosemary",
            () -> new CropBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS)), ModCreativeModeTab.BASIC_TAB);

    public static final RegistryObject<Block> THISTLE = registerBlock("thistle",
            () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)),
            ModCreativeModeTab.BASIC_TAB);

    public static final RegistryObject<Block> JUNCUS = registerBlock("juncus",
            () -> new river_plant(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH)),
            ModCreativeModeTab.BASIC_TAB);

    public static final RegistryObject<Block> CARNATION = registerBlock("carnation",
            () -> new FlowerBlock(MobEffects.LEVITATION, 5,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)), ModCreativeModeTab.BASIC_TAB);
    public static final RegistryObject<Block> POTTED_CARNATION = BLOCKS.register("potted_carnation",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.CARNATION,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM)));

    public static final RegistryObject<Block> CHAMOMILE = registerBlock("chamomile",
            () -> new FlowerBlock(MobEffects.LEVITATION, 5,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)), ModCreativeModeTab.BASIC_TAB);
    public static final RegistryObject<Block> POTTED_CHAMOMILE = BLOCKS.register("potted_chamomile",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.CHAMOMILE,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM)));

    public static final RegistryObject<Block> PEONY = registerBlock("peony",
            () -> new FlowerBlock(MobEffects.LEVITATION, 5,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)), ModCreativeModeTab.BASIC_TAB);
    public static final RegistryObject<Block> POTTED_PEONY = BLOCKS.register("potted_peony",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.PEONY,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM)));

    public static final RegistryObject<Block> VIOLET = registerBlock("violet",
            () -> new FlowerBlock(MobEffects.LEVITATION, 5,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)), ModCreativeModeTab.BASIC_TAB);
    public static final RegistryObject<Block> POTTED_VIOLET = BLOCKS.register("potted_violet",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.VIOLET,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM)));

    public static final RegistryObject<Block> WORMWOOD = registerBlock("wormwood",
            () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.TALL_GRASS)),
            ModCreativeModeTab.BASIC_TAB);




    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }



}
