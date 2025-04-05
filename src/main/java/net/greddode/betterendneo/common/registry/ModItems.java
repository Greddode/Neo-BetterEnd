package net.greddode.betterendneo.common.registry;

import com.google.common.collect.Sets;
import net.greddode.betterendneo.BetterEndNeo;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.LinkedHashSet;
import java.util.function.Supplier;

public class ModItems
{
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BetterEndNeo.MOD_ID);

    // MATERIAL ITEMS
    public static final DeferredItem<Item> AETERNIUM_INGOT = ITEMS.register("aeternium_ingot",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ENDER_DUST = ITEMS.register("ender_dust",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> END_LILY_LEAF = ITEMS.register("end_lily_leaf",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> END_LILY_LEAF_DRIED = ITEMS.register("end_lily_leaf_dried",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CRYSTAL_SHARDS = ITEMS.register("crystal_shards",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ETERNAL_CRYSTAL = ITEMS.register("eternal_crystal",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ENDER_SHARD = ITEMS.register("ender_shard",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_AMBER = ITEMS.register("raw_amber",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AMBER_GEM = ITEMS.register("amber_gem",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GLOWING_BULB = ITEMS.register("glowing_bulb",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GELATINE = ITEMS.register("gelatine",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CRYSTALLINE_SULPHUR = ITEMS.register("crystalline_sulphur",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HYDRALUX_PETAL = ITEMS.register("hydralux_petal",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ENCHANTED_PETAL = ITEMS.register("enchanted_petal",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LEATHER_STRIPE = ITEMS.register("leather_stripe",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LEATHER_WRAPPED_STICK = ITEMS.register("leather_wrapped_stick",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILK_FIBER = ITEMS.register("silk_fiber",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LUMECORN_ROD = ITEMS.register("lumecorn_rod",
            ()-> new Item(new Item.Properties()));

    //ARMOR
    public static final DeferredItem<ArmorItem> AETERNIUM_HELMET = ITEMS.register("aeternium_helmet",
            ()-> new ArmorItem(ModArmorMaterials.AETERNIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(15))));
    public static final DeferredItem<ArmorItem> AETERNIUM_CHESTPLATE = ITEMS.register("aeternium_chestplate",
            ()-> new ArmorItem(ModArmorMaterials.AETERNIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(15))));
    public static final DeferredItem<ArmorItem> AETERNIUM_LEGGINGS = ITEMS.register("aeternium_leggings",
            ()-> new ArmorItem(ModArmorMaterials.AETERNIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS  ,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(15))));
    public static final DeferredItem<ArmorItem> AETERNIUM_BOOTS = ITEMS.register("aeternium_boots",
            ()-> new ArmorItem(ModArmorMaterials.AETERNIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(15))));



    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
