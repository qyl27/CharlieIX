package cx.rain.mc.charlieix.items;

import cx.rain.mc.charlieix.api.capability.ICravatableCapability;
import cx.rain.mc.charlieix.capability.ModCapabilities;
import cx.rain.mc.charlieix.group.ModGroups;
import net.minecraft.enchantment.IArmorVanishable;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraftforge.common.util.LazyOptional;
import top.theillusivec4.curios.api.type.capability.ICurio;

public class Cravat extends Item implements IArmorVanishable, ICurio {
    public Cravat() {
        super(new Properties()
                .setNoRepair()
                .maxStackSize(1)
                .group(ModGroups.CHARLIEIX)
                .rarity(Rarity.RARE));
    }

    @Override
    public ActionResultType itemInteractionForEntity(ItemStack stack, PlayerEntity playerIn,
                                                     LivingEntity target, Hand hand) {
        if (target instanceof WolfEntity
                || target instanceof PlayerEntity) {
            LazyOptional<ICravatableCapability> lazy = target.getCapability(ModCapabilities.CRAVATABLE_CAPABILITY);
            lazy.ifPresent((cap) -> {
                cap.setHasCravat(true);
                cap.setColor(0xff0000);
            });
        }

        return super.itemInteractionForEntity(stack, playerIn, target, hand);
    }
}
