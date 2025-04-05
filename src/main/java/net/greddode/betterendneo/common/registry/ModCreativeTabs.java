package net.greddode.betterendneo.common.registry;

import net.greddode.betterendneo.BetterEndNeo;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterEndNeo.MOD_ID);

    public static final Supplier<CreativeModeTab> BISMUTH_ITEMS_TAB = CREATIVE_MODE_TAB.register("betterendneoitems",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AETERNIUM_INGOT.get()))
                    .title(Component.translatable("creativetab.betterendneo.betterendneo_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //MATERIAL ITEMS
                        output.accept(ModItems.AETERNIUM_INGOT);
                        output.accept(ModItems.ENDER_DUST);
                        output.accept(ModItems.END_LILY_LEAF);
                        output.accept(ModItems.END_LILY_LEAF_DRIED);
                        output.accept(ModItems.CRYSTAL_SHARDS);
                        output.accept(ModItems.ETERNAL_CRYSTAL);
                        output.accept(ModItems.ENDER_SHARD);
                        output.accept(ModItems.RAW_AMBER);
                        output.accept(ModItems.AMBER_GEM);
                        output.accept(ModItems.GLOWING_BULB);
                        output.accept(ModItems.GELATINE);
                        output.accept(ModItems.CRYSTALLINE_SULPHUR);
                        output.accept(ModItems.HYDRALUX_PETAL);
                        output.accept(ModItems.ENCHANTED_PETAL);
                        output.accept(ModItems.LEATHER_STRIPE);
                        output.accept(ModItems.LEATHER_WRAPPED_STICK);
                        output.accept(ModItems.SILK_FIBER);
                        output.accept(ModItems.LUMECORN_ROD);

                        //ARMOR
                        output.accept(ModItems.AETERNIUM_HELMET);
                        output.accept(ModItems.AETERNIUM_CHESTPLATE);
                        output.accept(ModItems.AETERNIUM_LEGGINGS);
                        output.accept(ModItems.AETERNIUM_BOOTS);
                    }).build());

    public static final Supplier<CreativeModeTab> BISMUTH_BLOCK_TAB = CREATIVE_MODE_TAB.register("bismuth_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.AETERNIUM_BLOCK))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(BetterEndNeo.MOD_ID, "betterendneoitems"))
                    .title(Component.translatable("creativetab.betterendneo.betterendneo_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.AETERNIUM_BLOCK);

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
