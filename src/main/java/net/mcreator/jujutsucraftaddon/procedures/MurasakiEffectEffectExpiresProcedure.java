package net.mcreator.jujutsucraftaddon.procedures;

import net.mcreator.jujutsucraft.procedures.KeyStartTechniqueOnKeyReleasedProcedure;
import net.mcreator.jujutsucraftaddon.network.JujutsucraftaddonModVariables;
import net.minecraft.world.entity.Entity;

public class MurasakiEffectEffectExpiresProcedure {
    public static void execute(Entity entity) {
        if (entity == null)
            return;
        {
            double _setval = 0;
            entity.getCapability(JujutsucraftaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                capability.soka = _setval;
                capability.syncPlayerVariables(entity);
            });
        }
        KeyStartTechniqueOnKeyReleasedProcedure.execute(entity);
    }
}
