package net.mcreator.jujutsucraftaddon.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jujutsucraftaddon.network.JujutsucraftaddonModVariables;

public class SelectWindProcedure {
    public static void execute(Entity entity) {
        if (entity == null)
            return;
        {
            String _setval = "Wind";
            entity.getCapability(JujutsucraftaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                capability.Element = _setval;
                capability.syncPlayerVariables(entity);
            });
        }
    }
}
