package cx.rain.mc.charlieix.capability.impl;

import cx.rain.mc.charlieix.api.capability.ICravatableCapability;
import net.minecraft.nbt.CompoundNBT;
import net.minecraftforge.common.util.INBTSerializable;

public class CravatableCapability implements ICravatableCapability {
    private boolean cravat = false;
    private int color = 0xff0000;

    @Override
    public boolean hasCravat() {
        return cravat;
    }

    @Override
    public void setHasCravat(boolean value) {
        cravat = value;
    }

    @Override
    public int color() {
        return color;
    }

    @Override
    public void setColor(int value) {
        color = value;
    }

    @Override
    public CompoundNBT serializeNBT() {
        CompoundNBT nbt = new CompoundNBT();
        nbt.putBoolean("HasCravat", hasCravat());
        nbt.putInt("Color", color());
        return nbt;
    }

    @Override
    public void deserializeNBT(CompoundNBT nbt) {
        boolean hasCravat = nbt.getBoolean("HasCravat");
        int color = nbt.getInt("Color");
        if (color == 0) {
            color = 0xff0000;
        }

        setHasCravat(hasCravat);
        setColor(color);
    }
}
