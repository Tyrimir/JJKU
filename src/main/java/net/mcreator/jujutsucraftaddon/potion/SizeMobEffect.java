package net.mcreator.jujutsucraftaddon.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class SizeMobEffect extends MobEffect {
    public SizeMobEffect() {
        super(MobEffectCategory.NEUTRAL, -1);
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}
