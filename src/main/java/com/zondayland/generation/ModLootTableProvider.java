package com.zondayland.generation;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.data.loot.BlockLootSubProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    protected ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    /**
     * Implement this method to add block drops.
     *
     * <p>Use the range of {@link BlockLootSubProvider#dropSelf} methods to generate block drops.
     */
    @Override
    public void generate() {
    }
}
