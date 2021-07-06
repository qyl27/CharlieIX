package cx.rain.mc.charlieix.api.capability;

import net.minecraft.nbt.CompoundNBT;
import net.minecraftforge.common.util.INBTSerializable;

public interface ICravatableCapability extends INBTSerializable<CompoundNBT> {
    public boolean hasCravat();

    public void setHasCravat(boolean value);

    public int color();

    public void setColor(int value);
}
