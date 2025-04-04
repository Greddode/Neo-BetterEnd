package net.greddode.betterendneo.common.registry;

import com.google.common.collect.Sets;
import net.greddode.betterendneo.BetterEndNeo;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.LinkedHashSet;
import java.util.function.Supplier;

public class ModItems
{
    public static Supplier<Item> registerWithTab(String name, Supplier<Item> supplier) {
        Supplier<Item> block = ITEMS.register(name, supplier);
        CREATIVE_TAB_ITEMS.add(block);
        return block;
    }
    public static Item.Properties basicItem() {
        return new Item.Properties();
    }

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, "betterendneo");
    public static LinkedHashSet<Supplier<Item>> CREATIVE_TAB_ITEMS = Sets.newLinkedHashSet();

    // MATERIAL ITEMS
    public static final Supplier<Item> AETERNIUM_INGOT = registerWithTab("aeternium_ingot",
            ()-> new Item(basicItem()));


    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
