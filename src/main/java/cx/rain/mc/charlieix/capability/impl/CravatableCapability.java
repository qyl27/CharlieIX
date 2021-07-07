package cx.rain.mc.charlieix.capability.impl;

import cx.rain.mc.charlieix.api.capability.ICravatableCapability;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;

public class CravatableCapability implements ICravatableCapability {
    private ItemStack cravat = ItemStack.EMPTY;

    @Override
    public ItemStack getCravat() {
        return cravat;
    }

    @Override
    public void setCravat(ItemStack cravatIn) {
        cravat = cravatIn;
    }

    @Override
    public CompoundNBT serializeNBT() {
        CompoundNBT nbt = new CompoundNBT();
        nbt.put("Cravat", cravat.serializeNBT());
        return nbt;
    }

    @Override
    public void deserializeNBT(CompoundNBT nbt) {
        INBT stackNbt = nbt.get("Cravat");
        if (stackNbt instanceof CompoundNBT) {
            CompoundNBT stackCompoundNbt = (CompoundNBT) stackNbt;
            cravat = ItemStack.read(stackCompoundNbt);
        }
    }
}
