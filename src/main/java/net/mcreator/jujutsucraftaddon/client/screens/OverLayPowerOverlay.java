package net.mcreator.jujutsucraftaddon.client.screens;

import net.mcreator.jujutsucraftaddon.procedures.OverLayPowerDisplayOverlayIngameProcedure;
import net.mcreator.jujutsucraftaddon.procedures.ReturnOP2Procedure;
import net.mcreator.jujutsucraftaddon.procedures.ReturnOPProcedure;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class OverLayPowerOverlay {
    @SubscribeEvent(priority = EventPriority.NORMAL)
    public static void eventHandler(RenderGuiEvent.Pre event) {
        int w = event.getWindow().getGuiScaledWidth();
        int h = event.getWindow().getGuiScaledHeight();
        Level world = null;
        double x = 0;
        double y = 0;
        double z = 0;
        Player entity = Minecraft.getInstance().player;
        if (entity != null) {
            world = entity.level();
            x = entity.getX();
            y = entity.getY();
            z = entity.getZ();
        }
        if (OverLayPowerDisplayOverlayIngameProcedure.execute(world, entity)) {
            event.getGuiGraphics().drawString(Minecraft.getInstance().font,

                    ReturnOPProcedure.execute(entity), w / 2 + -45, h / 2 + -104, -256, false);
            event.getGuiGraphics().drawString(Minecraft.getInstance().font,

                    ReturnOP2Procedure.execute(entity), w / 2 + -45, h / 2 + -95, -256, false);
        }
    }
}
