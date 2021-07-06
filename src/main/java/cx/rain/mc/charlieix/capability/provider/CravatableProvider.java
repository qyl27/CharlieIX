package cx.rain.mc.charlieix.capability.provider;

import cx.rain.mc.charlieix.api.capability.ICravatableCapability;
import cx.rain.mc.charlieix.capability.ModCapabilities;
import cx.rain.mc.charlieix.capability.impl.CravatableCapability;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.common.util.LazyOptional;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class CravatableProvider implements ICapabilityProvider, INBTSerializable<CompoundNBT> {
    private ICravatableCapability cravatableCapability;

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        return cap == ModCapabilities.CRAVATABLE_CAPABILITY ? LazyOptional.of(this::getOrCreate).cast() : LazyOptional.empty();
    }

    private ICravatableCapability getOrCreate() {
        if (cravatableCapability == null) {
            cravatableCapability = new CravatableCapability();
        }
        return cravatableCapability;
    }

    @Override
    public CompoundNBT serializeNBT() {
        return cravatableCapability.serializeNBT();
    }

    @Override
    public void deserializeNBT(CompoundNBT nbt) {
        cravatableCapability.deserializeNBT(nbt);
    }
}
