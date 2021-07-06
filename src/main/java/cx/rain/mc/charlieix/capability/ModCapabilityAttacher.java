package cx.rain.mc.charlieix.capability;

import cx.rain.mc.charlieix.CharlieIX;
import cx.rain.mc.charlieix.capability.provider.CravatableProvider;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CharlieIX.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModCapabilityAttacher {
    @SubscribeEvent
    public static void onAttachCapability(AttachCapabilitiesEvent<Entity> event) {
        Entity entity = event.getObject();
        if (entity instanceof WolfEntity) {
            event.addCapability(new ResourceLocation(CharlieIX.MODID, "cravat"), new CravatableProvider());
        }
    }
}
