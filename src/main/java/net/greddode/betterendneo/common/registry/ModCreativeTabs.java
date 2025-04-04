package net.greddode.betterendneo.common.registry;

import net.greddode.betterendneo.BetterEndNeo;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterEndNeo.MOD_ID);

    public static final Supplier<CreativeModeTab> TAB_BETTERENDNEO = CREATIVE_TABS.register(BetterEndNeo.MOD_ID,
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.betterendneo"))
                    .icon(() -> new ItemStack(ModItems.AETERNIUM_INGOT.get()))
                    .displayItems((parameters, output) -> ModItems.CREATIVE_TAB_ITEMS.forEach((item) -> output.accept(item.get())))
                    .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_TABS.register(eventBus);
    }
}
