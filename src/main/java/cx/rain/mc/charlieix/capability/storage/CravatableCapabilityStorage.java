package cx.rain.mc.charlieix.capability.storage;

import cx.rain.mc.charlieix.api.capability.ICravatableCapability;
import net.minecraft.nbt.INBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;

import javax.annotation.Nullable;

public enum CravatableCapabilityStorage implements Capability.IStorage<ICravatableCapability> {
    INSTANCE;

    @Nullable
    @Override
    public INBT writeNBT(Capability<ICravatableCapability> capability, ICravatableCapability instance, Direction side) {
        return null;
    }

    @Override
    public void readNBT(Capability<ICravatableCapability> capability, ICravatableCapability instance, Direction side, INBT nbt) {

    }
}
