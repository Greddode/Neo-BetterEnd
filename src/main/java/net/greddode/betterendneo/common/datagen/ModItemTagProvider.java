package net.greddode.betterendneo.common.datagen;

import net.greddode.betterendneo.BetterEndNeo;
import net.greddode.betterendneo.common.registry.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider
{
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, BetterEndNeo.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider)
    {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.AETERNIUM_HELMET.get())
                .add(ModItems.AETERNIUM_CHESTPLATE.get())
                .add(ModItems.AETERNIUM_LEGGINGS.get())
                .add(ModItems.AETERNIUM_BOOTS.get());
    }
}
