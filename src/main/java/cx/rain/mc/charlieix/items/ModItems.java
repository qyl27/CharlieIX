package cx.rain.mc.charlieix.items;

import cx.rain.mc.charlieix.CharlieIX;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, CharlieIX.MODID);

    public ModItems(IEventBus bus) {
        CharlieIX.getLogger().info("Registering block items.");
        ITEMS.register(bus);
    }

    // Items below.
    public static RegistryObject<Item> CHARLIE_CRAVAT = ITEMS.register("charlie_cravat", () -> new CharlieCravat());

}
