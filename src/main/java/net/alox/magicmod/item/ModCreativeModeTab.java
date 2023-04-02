package net.alox.magicmod.item;

import net.alox.magicmod.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab BASIC_TAB = new CreativeModeTab("magicmodtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.LAVENDER.get());
        }
    };
}