package net.greddode.betterendneo.common.datagen;

import net.greddode.betterendneo.BetterEndNeo;
import net.greddode.betterendneo.common.registry.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.function.Supplier;

public class ModBlockStateProvider extends BlockStateProvider
{
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper)
    {
        super(output, BetterEndNeo.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        blockWithItem(ModBlocks.AETERNIUM_BLOCK);
    }
    private void blockWithItem(Supplier<Block> supplierBlock)
    {
        simpleBlockWithItem(supplierBlock.get(), cubeAll(supplierBlock.get()));
    }
}
