package net.alox.magicmod.item;

import net.alox.magicmod.MagicMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MagicMod.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
