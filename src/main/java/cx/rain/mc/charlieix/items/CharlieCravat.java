package cx.rain.mc.charlieix.items;

import cx.rain.mc.charlieix.group.ModGroups;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;

public class CharlieCravat extends Item {
    public CharlieCravat() {
        super(new Properties()
                .setNoRepair()
                .maxStackSize(1)
                .group(ModGroups.CHARLIEIX)
                .rarity(Rarity.RARE));
    }

    @Override
    public ActionResultType itemInteractionForEntity(ItemStack stack, PlayerEntity playerIn,
                                                     LivingEntity target, Hand hand) {
        

        return super.itemInteractionForEntity(stack, playerIn, target, hand);
    }
}
