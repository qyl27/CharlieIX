package cx.rain.mc.charlieix.data.provider.base;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public abstract class ItemTagsProviderBase extends ItemTagsProvider {
    public ItemTagsProviderBase(DataGenerator generator, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(generator, new BlockTagsProvider(generator, modId, existingFileHelper), modId, existingFileHelper);
    }

    @Override
    protected abstract void registerTags();
}
