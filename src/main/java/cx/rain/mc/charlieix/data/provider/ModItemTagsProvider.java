package cx.rain.mc.charlieix.data.provider;

import cx.rain.mc.charlieix.CharlieIX;
import cx.rain.mc.charlieix.data.ModItemTags;
import cx.rain.mc.charlieix.data.provider.base.ItemTagsProviderBase;
import cx.rain.mc.charlieix.items.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class ModItemTagsProvider extends ItemTagsProviderBase {
    public ModItemTagsProvider(DataGenerator generator, @Nullable ExistingFileHelper existingFileHelper) {
        super(generator, CharlieIX.MODID, existingFileHelper);
    }

    @Override
    protected void registerTags() {
        getOrCreateBuilder(ModItemTags.NECKLACE).add(ModItems.CRAVAT.get());
    }
}
