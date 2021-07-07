package cx.rain.mc.charlieix.data;

import cx.rain.mc.charlieix.CharlieIX;
import cx.rain.mc.charlieix.data.provider.ModItemModelProvider;
import cx.rain.mc.charlieix.data.provider.ModItemTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = CharlieIX.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGen {
    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper helper = event.getExistingFileHelper();

        if (event.includeClient()) {
            generator.addProvider(new ModItemModelProvider(generator, helper));
        }

        if (event.includeServer()) {
            generator.addProvider(new ModItemTagsProvider(generator, helper));
        }
    }
}
