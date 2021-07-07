package cx.rain.mc.charlieix.event;

import cx.rain.mc.charlieix.CharlieIX;
import cx.rain.mc.charlieix.entity.model.CravatPlayerEntityModel;
import cx.rain.mc.charlieix.entity.model.CravatWolfEntityModel;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CharlieIX.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EventRenderLiving {
    @SubscribeEvent
    public static void onRenderWolf(RenderLivingEvent.Post<WolfEntity, CravatWolfEntityModel> event) {
        // Todo
        new CravatWolfEntityModel().render(event.getMatrixStack(), event.getBuffers().getBuffer(RenderType.getCutout()), event.getLight(), 0, 1.0f, 0.0f, 0.0f, 1.0f);
    }


    @SubscribeEvent
    public static void onRenderPlayer(RenderLivingEvent.Post<PlayerEntity, CravatPlayerEntityModel> event) {
        // Todo
        new CravatPlayerEntityModel().render(event.getMatrixStack(), event.getBuffers().getBuffer(RenderType.getCutout()), event.getLight(), 0, 1.0f, 0.0f, 0.0f, 1.0f);
    }
}
