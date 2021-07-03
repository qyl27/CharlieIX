package cx.rain.mc.charlieix.block;

import cx.rain.mc.charlieix.CharlieIX;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlockItems {
    public static final DeferredRegister<Item> BLOCK_ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CharlieIX.MODID);

    public ModBlockItems(IEventBus bus) {
        CharlieIX.getLogger().info("Registering block items.");
        BLOCK_ITEMS.register(bus);
    }

    // Block items below.
    
}
