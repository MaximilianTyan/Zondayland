package com.zondayland.registry;

import com.zondayland.items.claims.ClaimParchmentItem;
import com.zondayland.items.claims.ServerClaimItem;
import com.zondayland.items.claims.ServerUnclaimItem;
import com.zondayland.items.claims.UnclaimParchmentItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import static com.zondayland.ZondayLand.LOGGER;
import static com.zondayland.ZondayLand.MOD_ID;

public class ModItems {
    public static final Item LOGO = new Item(new FabricItemSettings().maxCount(1));
    public static final Item CLAIM_PARCHMENT = new ClaimParchmentItem(new FabricItemSettings().maxCount(1));
    public static final Item UNCLAIM_PARCHMENT = new UnclaimParchmentItem(new FabricItemSettings().maxCount(1));
    public static final Item SERVER_CLAIM = new ServerClaimItem(new FabricItemSettings().maxCount(1));
    public static final Item SERVER_UNCLAIM = new ServerUnclaimItem(new FabricItemSettings().maxCount(1));
    public static final Item MICROPHONE = new Item(new FabricItemSettings().maxCount(1));
    public static final Item MIC_HOLDER = new BlockItem(ModBlocks.MIC_HOLDER, new FabricItemSettings());

    public static void register() {
        LOGGER.info("Registering items");

        // Items
        Items.registerItem( new ResourceLocation(MOD_ID, "logo"), LOGO);
        Items.registerItem( new ResourceLocation(MOD_ID, "claim_parchment"), CLAIM_PARCHMENT);
        Items.registerItem( new ResourceLocation(MOD_ID, "unclaim_parchment"), UNCLAIM_PARCHMENT);
        Items.registerItem( new ResourceLocation(MOD_ID, "server_claim"), SERVER_CLAIM);
        Items.registerItem( new ResourceLocation(MOD_ID, "server_unclaim"), SERVER_UNCLAIM);
        Items.registerItem( new ResourceLocation(MOD_ID, "microphone"), MICROPHONE);

        // Blocks Items
        Items.registerItem( new ResourceLocation(MOD_ID, "mic_holder"), MIC_HOLDER);
    }
}
