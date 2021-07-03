package cx.rain.mc.charlieix.group;

import cx.rain.mc.charlieix.CharlieIX;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class GroupBase extends ItemGroup {
    public Item item;

    public GroupBase(String label, Item itemIn) {
        super(CharlieIX.MODID + "." + label);
        item = itemIn;
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(item);
    }
}
