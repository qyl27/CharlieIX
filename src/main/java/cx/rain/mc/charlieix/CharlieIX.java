package cx.rain.mc.charlieix;

import cx.rain.mc.charlieix.block.ModBlockItems;
import cx.rain.mc.charlieix.block.ModBlocks;
import cx.rain.mc.charlieix.items.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("charlieix")
public class CharlieIX {
    public static final String MODID = "charlieix";
    public static final String NAME = "CharlieIX";
    public static final String MC_VERSION = "1.16.5";
    public static final String MOD_VERSION = "1.0.0";
    public static final String VERSION = MC_VERSION + "-" + MOD_VERSION;

    private static CharlieIX INSTANCE = null;

    private static final Logger LOGGER = LogManager.getLogger(CharlieIX.NAME);

    public CharlieIX() {
        if (INSTANCE != null) {
            throw new RuntimeException("Why init me twice?");
        }
        INSTANCE = this;

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        bus.addListener(this::setup);
        bus.addListener(this::clientSetup);

        new ModBlocks(bus);
        new ModBlockItems(bus);
        new ModItems(bus);
    }

    public static Logger getLogger() {
        return LOGGER;
    }

    public static CharlieIX getInstance() {
        return INSTANCE;
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    private void clientSetup(final FMLClientSetupEvent event) {

    }
}
