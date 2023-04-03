package net.alox.magicmod.world.feature;

import net.alox.magicmod.MagicMod;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures {

    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, MagicMod.MODID);

    public static final RegistryObject<PlacedFeature> LAVENDER_PLACED = PLACED_FEATURES.register("lavender_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.LAVENDER.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(16),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> ROSEMARY_PLACED = PLACED_FEATURES.register("rosemary_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.ROSEMARY.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(16),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> THISTLE_PLACED = PLACED_FEATURES.register("thistle_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.THISTLE.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(16),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> JUNCUS_PLACED = PLACED_FEATURES.register("juncus_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.JUNCUS.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(16),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> CARNATION_PLACED = PLACED_FEATURES.register("carnation_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.CARNATION.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(16),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> CHAMOMILE_PLACED = PLACED_FEATURES.register("chamomile_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.CHAMOMILE.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(16),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> PEONY_PLACED = PLACED_FEATURES.register("peony_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.PEONY.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(16),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> VIOLET_PLACED = PLACED_FEATURES.register("violet_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.VIOLET.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(16),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> WORMWOOD_PLACED = PLACED_FEATURES.register("wormwood_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.WORMWOOD.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(16),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));

    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }

}
