package cx.rain.mc.charlieix.capability;

import cx.rain.mc.charlieix.CharlieIX;
import cx.rain.mc.charlieix.api.capability.ICravatableCapability;
import cx.rain.mc.charlieix.capability.provider.CravatableProvider;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CharlieIX.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModCapabilityAttacher {
    @SubscribeEvent
    public static void onAttachCapability(AttachCapabilitiesEvent<Entity> event) {
        Entity entity = event.getObject();
        if (entity instanceof WolfEntity
                || entity instanceof PlayerEntity) {
            event.addCapability(new ResourceLocation(CharlieIX.MODID, "cravat"), new CravatableProvider());
        }
    }

    @SubscribeEvent
    public static void onPlayerClone(PlayerEvent.Clone event) {
        if (!event.isWasDeath()) {
            LazyOptional<ICravatableCapability> capabilityLazyOld = event.getOriginal().getCapability(ModCapabilities.CRAVATABLE_CAPABILITY);
            LazyOptional<ICravatableCapability> capabilityLazyNew = event.getPlayer().getCapability(ModCapabilities.CRAVATABLE_CAPABILITY);
            if (capabilityLazyOld.isPresent() && capabilityLazyNew.isPresent()) {
                capabilityLazyNew.ifPresent((capabilityNew) -> {
                    capabilityLazyOld.ifPresent((capabilityOld) -> {
                        capabilityNew.deserializeNBT(capabilityOld.serializeNBT());
                    });
                });
            }
        }
    }
}
