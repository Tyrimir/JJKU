package net.mcreator.jujutsucraftaddon.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.jujutsucraftaddon.procedures.GojoImbuedPowerOnEffectActiveTickProcedure;

public class GojoImbuedPowerMobEffect extends MobEffect {
    public GojoImbuedPowerMobEffect() {
        super(MobEffectCategory.NEUTRAL, -1);
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        GojoImbuedPowerOnEffectActiveTickProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}
