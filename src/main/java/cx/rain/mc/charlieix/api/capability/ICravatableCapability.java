package cx.rain.mc.charlieix.api.capability;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraftforge.common.util.INBTSerializable;

public interface ICravatableCapability extends INBTSerializable<CompoundNBT> {
    public ItemStack getCravat();

    public void setCravat(ItemStack cravat);
}
