package cx.rain.mc.charlieix.data.provider;

import cx.rain.mc.charlieix.CharlieIX;
import cx.rain.mc.charlieix.data.provider.base.ItemModelProviderBase;
import cx.rain.mc.charlieix.items.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProviderBase {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, CharlieIX.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.CRAVAT.get());
    }
}
