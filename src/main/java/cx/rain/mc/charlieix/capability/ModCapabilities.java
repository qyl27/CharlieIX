package cx.rain.mc.charlieix.capability;

import cx.rain.mc.charlieix.CharlieIX;
import cx.rain.mc.charlieix.api.capability.ICravatableCapability;
import cx.rain.mc.charlieix.capability.impl.CravatableCapability;
import cx.rain.mc.charlieix.capability.storage.CravatableCapabilityStorage;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = CharlieIX.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCapabilities {
    @CapabilityInject(ICravatableCapability.class)
    public static Capability<ICravatableCapability> CRAVATABLE_CAPABILITY;

    @SubscribeEvent
    public static void onFMLCommonSetupEvent(FMLCommonSetupEvent event) {
        event.enqueueWork(ModCapabilities::registerCapability);
    }

    protected static void registerCapability() {
        // Register capabilities below.
        CapabilityManager.INSTANCE.register(ICravatableCapability.class, CravatableCapabilityStorage.INSTANCE, CravatableCapability::new);
    }
}
