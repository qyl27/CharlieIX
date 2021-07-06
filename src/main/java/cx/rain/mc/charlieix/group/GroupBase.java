package cx.rain.mc.charlieix.group;

import cx.rain.mc.charlieix.CharlieIX;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.RegistryObject;

public class GroupBase extends ItemGroup {
    public RegistryObject<Item> item;

    public GroupBase(String label, RegistryObject<Item> itemIn) {
        super(CharlieIX.MODID + "." + label);
        item = itemIn;
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(item.get());
    }
}
