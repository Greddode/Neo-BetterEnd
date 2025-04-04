package net.greddode.betterendneo.common.datagen;

import net.greddode.betterendneo.BetterEndNeo;
import net.greddode.betterendneo.common.registry.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider
{
    public ModItemModelProvider(PackOutput output, ExistingFileHelper exFileHelper)
    {
        super(output, BetterEndNeo.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.AETERNIUM_INGOT.get());
    }
}
