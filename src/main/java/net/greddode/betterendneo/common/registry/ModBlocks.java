package net.greddode.betterendneo.common.registry;

import net.greddode.betterendneo.BetterEndNeo;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, BetterEndNeo.MOD_ID);

    public static final Supplier<Block> AETERNIUM_BLOCK = BLOCKS.register("aeternium_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}
