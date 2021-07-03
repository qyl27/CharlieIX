package cx.rain.mc.charlieix.block;

import cx.rain.mc.charlieix.CharlieIX;
import net.minecraft.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CharlieIX.MODID);

    public ModBlocks(IEventBus bus) {
        CharlieIX.getLogger().info("Registering blocks.");
        BLOCKS.register(bus);
    }

    // Blocks below.

}
