package cx.rain.mc.charlieix.data;

import net.minecraft.item.Item;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import top.theillusivec4.curios.api.CuriosApi;

public class ModItemTags {
    public static final ITag.INamedTag<Item> NECKLACE = ItemTags.createOptional(new ResourceLocation(CuriosApi.MODID, "necklace"));
}
