package com.hellos.examplemod.world.feature;

import com.hellos.examplemod.world.feature.ModConfiguredFeatures;
import com.hellos.examplemod.world.feature.ModOrePlacement;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {

    public static final Holder<PlacedFeature> TIN_ORE_PLACED = PlacementUtils.register("tin_ore_placed",
            ModConfiguredFeatures.TIN_ORE, ModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-10), VerticalAnchor.belowTop(240))));

    public static final Holder<PlacedFeature> COBALT_ORE_PLACED = PlacementUtils.register("cobalt_ore_placed",
            ModConfiguredFeatures.COBALT_ORE, ModOrePlacement.commonOrePlacement(3, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-10), VerticalAnchor.belowTop(270))));

    public static final Holder<PlacedFeature> ALUMINUM_ORE_PLACED = PlacementUtils.register("aluminum_ore_placed",
            ModConfiguredFeatures.ALUMINUM_ORE, ModOrePlacement.commonOrePlacement(9, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-10), VerticalAnchor.belowTop(240))));
}
