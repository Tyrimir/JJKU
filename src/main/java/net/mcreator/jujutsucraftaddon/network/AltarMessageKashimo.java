package net.mcreator.jujutsucraftaddon.network;

import net.mcreator.jujutsucraft.init.JujutsucraftModMobEffects;
import net.mcreator.jujutsucraft.network.JujutsucraftModVariables;
import net.mcreator.jujutsucraft.procedures.KeyStartTechniqueOnKeyPressedProcedure;
import net.mcreator.jujutsucraftaddon.JujutsucraftaddonMod;
import net.mcreator.jujutsucraftaddon.procedures.RemoveCE;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AltarMessageKashimo {
    int page;

    // Constructor
    public AltarMessageKashimo(int page) {
        this.page = page;
    }

    // Decoder
    public AltarMessageKashimo(FriendlyByteBuf buffer) {
        this.page = buffer.readInt();
    }

    // Encoder
    public static void buffer(AltarMessageKashimo message, FriendlyByteBuf buffer) {
        buffer.writeInt(message.page);
    }

    // Handler
    public static void handler(AltarMessageKashimo message, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();
        context.enqueueWork(() -> {
            pressAction(context.getSender(), message.page);
        });
        context.setPacketHandled(true);
    }

    // Action logic based on type and pressed time
    public static void pressAction(Player entity, int page) {
        Level world = entity.level();
        double x = entity.getX();
        double y = entity.getY();
        double z = entity.getZ();

        // Check if the chunk is loaded
        if (!world.hasChunkAt(entity.blockPosition()))
            return;

        // Ações feitas, cada page = um index, lembrando que começa por 0, não por 1
        if (entity.getCapability(JujutsucraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JujutsucraftModVariables.PlayerVariables()).PlayerCurseTechnique2 == 7 && entity.getCapability(JujutsucraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JujutsucraftModVariables.PlayerVariables()).PlayerCursePower >= 500) {
            // Execute actions based on the type
            if (page == 0) {
                // Strong Attack
                entity.getPersistentData().putDouble("skill", -99);
                entity.getPersistentData().putBoolean("PRESS_Z", true);
                entity.addEffect(new MobEffectInstance(JujutsucraftModMobEffects.CURSED_TECHNIQUE.get(), 60, 3, false, false));
            } else if (page == 1) {
                //Speed Blitz
                entity.getPersistentData().putDouble("skill", 700);
                KeyStartTechniqueOnKeyPressedProcedure.execute(world, x, y, z, entity);
                entity.getCapability(JujutsucraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                    capability.PlayerSelectCurseTechniqueName = (Component.translatable("jujutsu.technique.attack1").getString());
                    capability.syncPlayerVariables(entity);
                });
                entity.addEffect(new MobEffectInstance(JujutsucraftModMobEffects.COOLDOWN_TIME_COMBAT.get(), 10));
            } else if (page == 2) {
                //Kaminari Strike
                entity.getPersistentData().putDouble("skill", 701);
                KeyStartTechniqueOnKeyPressedProcedure.execute(world, x, y, z, entity);
                entity.getCapability(JujutsucraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                    capability.PlayerSelectCurseTechniqueName = (Component.translatable("jujutsu.technique.attack2").getString());
                    capability.syncPlayerVariables(entity);
                });
                entity.addEffect(new MobEffectInstance(JujutsucraftModMobEffects.COOLDOWN_TIME_COMBAT.get(), 10));
            } else if (page == 3) {
                //Lightning Barrage
                entity.getCapability(JujutsucraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                    capability.PlayerSelectCurseTechniqueName = (Component.translatable("jujutsu.technique.attack3").getString());
                    capability.syncPlayerVariables(entity);
                    entity.getPersistentData().putDouble("skill", 702);
                    KeyStartTechniqueOnKeyPressedProcedure.execute(world, x, y, z, entity);
                });
                entity.addEffect(new MobEffectInstance(JujutsucraftModMobEffects.COOLDOWN_TIME_COMBAT.get(), 10));
            }
            else if (page == 4) {
                //Lightning Strike
                entity.getPersistentData().putDouble("skill", 705);
                KeyStartTechniqueOnKeyPressedProcedure.execute(world, x, y, z, entity);
                entity.getCapability(JujutsucraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                    capability.PlayerSelectCurseTechniqueName = (Component.translatable("jujutsu.technique.kashimo1").getString());
                    capability.syncPlayerVariables(entity);
                });
                entity.addEffect(new MobEffectInstance(JujutsucraftModMobEffects.COOLDOWN_TIME_COMBAT.get(), 10));
            }
            else if (page == 5) {
                //Turn Up The Volume
                entity.getPersistentData().putDouble("skill", 710);
                KeyStartTechniqueOnKeyPressedProcedure.execute(world, x, y, z, entity);
                entity.getCapability(JujutsucraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                    capability.PlayerSelectCurseTechniqueName = (Component.translatable("jujutsu.technique.kashimo2").getString());
                    capability.syncPlayerVariables(entity);
                });
                entity.addEffect(new MobEffectInstance(JujutsucraftModMobEffects.COOLDOWN_TIME_COMBAT.get(), 10));
            }
            else if (page == 6) {
                //Mythical Beast Amber
                entity.getPersistentData().putDouble("skill", 715);
                KeyStartTechniqueOnKeyPressedProcedure.execute(world, x, y, z, entity);
                entity.getCapability(JujutsucraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                    capability.PlayerSelectCurseTechniqueName = (Component.translatable("jujutsu.technique.kashimo1").getString());
                    capability.syncPlayerVariables(entity);
                });
                entity.addEffect(new MobEffectInstance(JujutsucraftModMobEffects.COOLDOWN_TIME_COMBAT.get(), 10));
            }
            else if (page == 7) {
                //Domain Expansion
                entity.getPersistentData().putDouble("skill", 720);
                KeyStartTechniqueOnKeyPressedProcedure.execute(world, x, y, z, entity);
                entity.getCapability(JujutsucraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                    capability.PlayerSelectCurseTechniqueName = (Component.translatable("jujutsu.technique.kashimo2").getString());
                    capability.syncPlayerVariables(entity);
                });
                entity.addEffect(new MobEffectInstance(JujutsucraftModMobEffects.COOLDOWN_TIME_COMBAT.get(), 10));
            }
        }
        RemoveCE.execute(entity, world);
    }
    // Registrando o Packet
    @SubscribeEvent
    public static void registerMessage(FMLCommonSetupEvent event) {
        JujutsucraftaddonMod.addNetworkMessage(AltarMessageKashimo.class, AltarMessageKashimo::buffer, AltarMessageKashimo::new, AltarMessageKashimo::handler);
    }
}
