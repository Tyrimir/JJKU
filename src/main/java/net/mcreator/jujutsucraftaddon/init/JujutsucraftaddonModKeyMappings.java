
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jujutsucraftaddon.init;

import net.mcreator.jujutsucraft.network.JujutsucraftModVariables;
import net.mcreator.jujutsucraftaddon.JujutsucraftaddonMod;
import net.mcreator.jujutsucraftaddon.client.screens.*;
import net.mcreator.jujutsucraftaddon.network.*;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.lwjgl.glfw.GLFW;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class JujutsucraftaddonModKeyMappings {
    public static final KeyMapping WORLD_SLASH_KEY = new KeyMapping("key.jujutsucraftaddon.world_slash_key", GLFW.GLFW_KEY_F, "Jujutsu Kaisen Ultimate") {
        private boolean isDownOld = false;

        @Override
        public void setDown(boolean isDown) {
            super.setDown(isDown);
            if (isDownOld != isDown && isDown) {
                JujutsucraftaddonMod.PACKET_HANDLER.sendToServer(new WorldSlashKeyMessage(0, 0));
                WorldSlashKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
                WORLD_SLASH_KEY_LASTPRESS = System.currentTimeMillis();
            } else if (isDownOld != isDown && !isDown) {
                int dt = (int) (System.currentTimeMillis() - WORLD_SLASH_KEY_LASTPRESS);
                JujutsucraftaddonMod.PACKET_HANDLER.sendToServer(new WorldSlashKeyMessage(1, dt));
                WorldSlashKeyMessage.pressAction(Minecraft.getInstance().player, 1, dt);
            }
            isDownOld = isDown;
        }
    };
    public static final KeyMapping ARMORY_OR_COPY = new KeyMapping("key.jujutsucraftaddon.armory_or_copy", GLFW.GLFW_KEY_H, "Jujutsu Kaisen Ultimate") {
        private boolean isDownOld = false;

        @Override
        public void setDown(boolean isDown) {
            super.setDown(isDown);
            if (isDownOld != isDown && isDown) {
                JujutsucraftaddonMod.PACKET_HANDLER.sendToServer(new ArmoryOrCopyMessage(0, 0));
                ArmoryOrCopyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
            }
            isDownOld = isDown;
        }
    };
    public static final KeyMapping ALTAR_SELECTOR = new KeyMapping("key.jujutsucraftaddon.altar", GLFW.GLFW_KEY_PERIOD, "Jujutsu Kaisen Ultimate") {
        private boolean isDownOld = false;

        @Override
        public void setDown(boolean isDown) {
            super.setDown(isDown);
            Minecraft minecraft = Minecraft.getInstance();
            var player = minecraft.player;
            if (isDownOld != isDown && isDown) {
                assert player != null;
                if (!(player.getCapability(JujutsucraftaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JujutsucraftaddonModVariables.PlayerVariables()).Clans.equals("Kenjaku") || player.hasEffect(JujutsucraftaddonModMobEffects.MANIFESTATION.get()))) {
                    if (player.getCapability(JujutsucraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JujutsucraftModVariables.PlayerVariables()).PlayerCurseTechnique2 == 5) {
                        Minecraft.getInstance().execute(() -> {
                            if (Minecraft.getInstance().screen == null) {
                                Minecraft.getInstance().setScreen(new AltarSelectorScreen());
                            }
                        });
                    } else if (player.getCapability(JujutsucraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JujutsucraftModVariables.PlayerVariables()).PlayerCurseTechnique2 == 15) {
                        Minecraft.getInstance().execute(() -> {
                            if (Minecraft.getInstance().screen == null) {
                                Minecraft.getInstance().setScreen(new MahitoScreen());
                            }
                        });
                    } else if (player.getCapability(JujutsucraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JujutsucraftModVariables.PlayerVariables()).PlayerCurseTechnique2 == 20) {
                        Minecraft.getInstance().execute(() -> {
                            if (Minecraft.getInstance().screen == null) {
                                Minecraft.getInstance().setScreen(new TodoScreen());
                            }
                        });
                    } else if (player.getCapability(JujutsucraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JujutsucraftModVariables.PlayerVariables()).PlayerCurseTechnique2 == 10) {
                        Minecraft.getInstance().execute(() -> {
                            if (Minecraft.getInstance().screen == null) {
                                Minecraft.getInstance().setScreen(new ChosoScreen());
                            }
                        });
                    } else if (player.getCapability(JujutsucraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JujutsucraftModVariables.PlayerVariables()).PlayerCurseTechnique2 == 6) {
                        Minecraft.getInstance().execute(() -> {
                            if (Minecraft.getInstance().screen == null) {
                                Minecraft.getInstance().setScreen(new MegumiScreen());
                            }
                        });
                    } else if (player.getCapability(JujutsucraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JujutsucraftModVariables.PlayerVariables()).PlayerCurseTechnique2 == -1) {
                        Minecraft.getInstance().execute(() -> {
                            if (Minecraft.getInstance().screen == null) {
                                Minecraft.getInstance().setScreen(new HRScreen());
                            }
                        });
                    } else if (player.getCapability(JujutsucraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JujutsucraftModVariables.PlayerVariables()).PlayerCurseTechnique == 21) {
                        Minecraft.getInstance().execute(() -> {
                            if (Minecraft.getInstance().screen == null) {
                                Minecraft.getInstance().setScreen(new ItadoriScreen());
                            }
                        });
                    } else if (player.getCapability(JujutsucraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JujutsucraftModVariables.PlayerVariables()).PlayerCurseTechnique == 29) {
                        Minecraft.getInstance().execute(() -> {
                            if (Minecraft.getInstance().screen == null) {
                                Minecraft.getInstance().setScreen(new HakariScreen());
                            }
                        });
                    } else if (player.getCapability(JujutsucraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JujutsucraftModVariables.PlayerVariables()).PlayerCurseTechnique == 16) {
                        Minecraft.getInstance().execute(() -> {
                            if (Minecraft.getInstance().screen == null) {
                                Minecraft.getInstance().setScreen(new MahoragaScreen());
                            }
                        });
                    } else if (player.getCapability(JujutsucraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JujutsucraftModVariables.PlayerVariables()).PlayerCurseTechnique == 2) {
                        Minecraft.getInstance().execute(() -> {
                            if (Minecraft.getInstance().screen == null) {
                                Minecraft.getInstance().setScreen(new GojoScreen());
                            }
                        });
                    }
                    else if (player.getCapability(JujutsucraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JujutsucraftModVariables.PlayerVariables()).PlayerCurseTechnique == 1) {
                        Minecraft.getInstance().execute(() -> {
                            if (Minecraft.getInstance().screen == null) {
                                Minecraft.getInstance().setScreen(new SukunaScreen());
                            }
                        });
                    }
                    else if (player.getCapability(JujutsucraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JujutsucraftModVariables.PlayerVariables()).PlayerCurseTechnique == 7) {
                        Minecraft.getInstance().execute(() -> {
                            if (Minecraft.getInstance().screen == null) {
                                Minecraft.getInstance().setScreen(new KashimoScreen());
                            }
                        });
                    }
                }
            }
            isDownOld = isDown;
        }
        private boolean preventRecursiveSend = false;
    };
    public static final KeyMapping KEY_WHEEL = new KeyMapping("key.jujutsucraftaddon.key_wheel", GLFW.GLFW_KEY_C, "Jujutsu Kaisen Ultimate") {
        private boolean isDownOld = false;

        @Override
        public void setDown(boolean isDown) {
            super.setDown(isDown);
            if (isDownOld != isDown && isDown) {
                JujutsucraftaddonMod.PACKET_HANDLER.sendToServer(new KeyWheelMessage(0, 0));
                KeyWheelMessage.pressAction(Minecraft.getInstance().player, 0, 0);
            }
            isDownOld = isDown;
        }
    };
    public static final KeyMapping ANIMATION_KEYBIND = new KeyMapping("key.jujutsucraftaddon.animation_keybind", GLFW.GLFW_KEY_B, "Jujutsu Kaisen Ultimate") {
        private boolean isDownOld = false;

        @Override
        public void setDown(boolean isDown) {
            super.setDown(isDown);
            if (isDownOld != isDown && isDown) {
                JujutsucraftaddonMod.PACKET_HANDLER.sendToServer(new AnimationKeybindMessage(0, 0));
                AnimationKeybindMessage.pressAction(Minecraft.getInstance().player, 0, 0);
                ANIMATION_KEYBIND_LASTPRESS = System.currentTimeMillis();
            } else if (isDownOld != isDown && !isDown) {
                int dt = (int) (System.currentTimeMillis() - ANIMATION_KEYBIND_LASTPRESS);
                JujutsucraftaddonMod.PACKET_HANDLER.sendToServer(new AnimationKeybindMessage(1, dt));
                AnimationKeybindMessage.pressAction(Minecraft.getInstance().player, 1, dt);
            }
            isDownOld = isDown;
        }
    };
    public static final KeyMapping PASSIVE_KEYBIND = new KeyMapping("key.jujutsucraftaddon.passive_keybind", GLFW.GLFW_KEY_B, "Jujutsu Kaisen Ultimate") {
        private boolean isDownOld = false;

        @Override
        public void setDown(boolean isDown) {
            super.setDown(isDown);
            if (isDownOld != isDown && isDown) {
                JujutsucraftaddonMod.PACKET_HANDLER.sendToServer(new PassiveKeybindMessage(0, 0));
                PassiveKeybindMessage.pressAction(Minecraft.getInstance().player, 0, 0);
            }
            isDownOld = isDown;
        }
    };
    public static final KeyMapping CHANGE_TECHNIQUE = new KeyMapping("key.jujutsucraftaddon.change_technique", GLFW.GLFW_KEY_V, "Jujutsu Kaisen Ultimate") {
        private boolean isDownOld = false;

        @Override
        public void setDown(boolean isDown) {
            super.setDown(isDown);
            if (isDownOld != isDown && isDown) {
                JujutsucraftaddonMod.PACKET_HANDLER.sendToServer(new ChangeTechniqueMessage(0, 0));
                ChangeTechniqueMessage.pressAction(Minecraft.getInstance().player, 0, 0);
            }
            isDownOld = isDown;
        }
    };
    public static final KeyMapping DOMAIN_EXPANSION = new KeyMapping("key.jujutsucraftaddon.domain_expansion", GLFW.GLFW_KEY_UNKNOWN, "Jujutsu Kaisen Ultimate") {
        private boolean isDownOld = false;

        @Override
        public void setDown(boolean isDown) {
            super.setDown(isDown);
            if (isDownOld != isDown && isDown) {
                JujutsucraftaddonMod.PACKET_HANDLER.sendToServer(new DomainExpansionMessage(0, 0));
                DomainExpansionMessage.pressAction(Minecraft.getInstance().player, 0, 0);
                DOMAIN_EXPANSION_LASTPRESS = System.currentTimeMillis();
            } else if (isDownOld != isDown && !isDown) {
                int dt = (int) (System.currentTimeMillis() - DOMAIN_EXPANSION_LASTPRESS);
                JujutsucraftaddonMod.PACKET_HANDLER.sendToServer(new DomainExpansionMessage(1, dt));
                DomainExpansionMessage.pressAction(Minecraft.getInstance().player, 1, dt);
            }
            isDownOld = isDown;
        }
    };
    public static final KeyMapping EXTENSION_KEYBIND = new KeyMapping("key.jujutsucraftaddon.extension_keybind", GLFW.GLFW_KEY_UNKNOWN, "Jujutsu Kaisen Ultimate") {
        private boolean isDownOld = false;

        @Override
        public void setDown(boolean isDown) {
            super.setDown(isDown);
            if (isDownOld != isDown && isDown) {
                JujutsucraftaddonMod.PACKET_HANDLER.sendToServer(new ExtensionKeybindMessage(0, 0));
                ExtensionKeybindMessage.pressAction(Minecraft.getInstance().player, 0, 0);
            }
            isDownOld = isDown;
        }
    };
    public static final KeyMapping TEST_ANIMATION = new KeyMapping("key.jujutsucraftaddon.test_animation", GLFW.GLFW_KEY_KP_DECIMAL, "Jujutsu Kaisen Ultimate") {
        private boolean isDownOld = false;

        @Override
        public void setDown(boolean isDown) {
            super.setDown(isDown);
            if (isDownOld != isDown && isDown) {
                JujutsucraftaddonMod.PACKET_HANDLER.sendToServer(new TestAnimationMessage(0, 0));
                TestAnimationMessage.pressAction(Minecraft.getInstance().player, 0, 0);
            }
            isDownOld = isDown;
        }
    };
    public static final KeyMapping BURNOUT_KEY = new KeyMapping("key.jujutsucraftaddon.burnout_key", GLFW.GLFW_KEY_UNKNOWN, "Jujutsu Kaisen Ultimate") {
        private boolean isDownOld = false;

        @Override
        public void setDown(boolean isDown) {
            super.setDown(isDown);
            if (isDownOld != isDown && isDown) {
                JujutsucraftaddonMod.PACKET_HANDLER.sendToServer(new BurnoutKeyMessage(0, 0));
                BurnoutKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
                BURNOUT_KEY_LASTPRESS = System.currentTimeMillis();
            } else if (isDownOld != isDown && !isDown) {
                int dt = (int) (System.currentTimeMillis() - BURNOUT_KEY_LASTPRESS);
                JujutsucraftaddonMod.PACKET_HANDLER.sendToServer(new BurnoutKeyMessage(1, dt));
                BurnoutKeyMessage.pressAction(Minecraft.getInstance().player, 1, dt);
            }
            isDownOld = isDown;
        }
    };
    public static final KeyMapping WATER_WALKING = new KeyMapping("key.jujutsucraftaddon.water_walking", GLFW.GLFW_KEY_UNKNOWN, "Jujutsu Kaisen Ultimate") {
        private boolean isDownOld = false;

        @Override
        public void setDown(boolean isDown) {
            super.setDown(isDown);
            if (isDownOld != isDown && isDown) {
                JujutsucraftaddonMod.PACKET_HANDLER.sendToServer(new WaterWalkingMessage(0, 0));
                WaterWalkingMessage.pressAction(Minecraft.getInstance().player, 0, 0);
            }
            isDownOld = isDown;
        }
    };
    public static final KeyMapping CURSED_ENERGY_SHIELD = new KeyMapping("key.jujutsucraftaddon.cursed_energy_shield", GLFW.GLFW_KEY_UNKNOWN, "Jujutsu Kaisen Ultimate") {
        private boolean isDownOld = false;

        @Override
        public void setDown(boolean isDown) {
            super.setDown(isDown);
            if (isDownOld != isDown && isDown) {
                JujutsucraftaddonMod.PACKET_HANDLER.sendToServer(new CursedEnergyShieldMessage(0, 0));
                CursedEnergyShieldMessage.pressAction(Minecraft.getInstance().player, 0, 0);
            }
            isDownOld = isDown;
        }
    };
    public static final KeyMapping DOMAIN_TYPE = new KeyMapping("key.jujutsucraftaddon.domain_type", GLFW.GLFW_KEY_UNKNOWN, "Jujutsu Kaisen Ultimate") {
        private boolean isDownOld = false;

        @Override
        public void setDown(boolean isDown) {
            super.setDown(isDown);
            if (isDownOld != isDown && isDown) {
                JujutsucraftaddonMod.PACKET_HANDLER.sendToServer(new DomainTypeMessage(0, 0));
                DomainTypeMessage.pressAction(Minecraft.getInstance().player, 0, 0);
            }
            isDownOld = isDown;
        }
    };

    public static final KeyMapping RELEASE_TECHNIQUE = new KeyMapping("key.jujutsucraftaddon.release_technique", GLFW.GLFW_KEY_UNKNOWN, "Jujutsu Kaisen Ultimate") {
        private boolean isDownOld = false;

        @Override
        public void setDown(boolean isDown) {
            super.setDown(isDown);
            if (isDownOld != isDown && isDown) {
                JujutsucraftaddonMod.PACKET_HANDLER.sendToServer(new ReleaseTechniqueMessage(0, 0));
                ReleaseTechniqueMessage.pressAction(Minecraft.getInstance().player, 0, 0);
            }
            isDownOld = isDown;
        }
    };
    public static final KeyMapping CURSED_FISTS_KEYBIND = new KeyMapping("key.jujutsucraftaddon.cursed_fists_keybind", GLFW.GLFW_KEY_UNKNOWN, "Jujutsu Kaisen Ultimate") {
        private boolean isDownOld = false;

        @Override
        public void setDown(boolean isDown) {
            super.setDown(isDown);
            if (isDownOld != isDown && isDown) {
                JujutsucraftaddonMod.PACKET_HANDLER.sendToServer(new CursedFistsKeybindMessage(0, 0));
                CursedFistsKeybindMessage.pressAction(Minecraft.getInstance().player, 0, 0);
            }
            isDownOld = isDown;
        }
    };

    private static long WORLD_SLASH_KEY_LASTPRESS = 0;
    private static long ANIMATION_KEYBIND_LASTPRESS = 0;
    private static long DOMAIN_EXPANSION_LASTPRESS = 0;
    private static long BURNOUT_KEY_LASTPRESS = 0;

    @SubscribeEvent
    public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
        event.register(WORLD_SLASH_KEY);
        event.register(ARMORY_OR_COPY);
        event.register(ALTAR_SELECTOR);
        event.register(KEY_WHEEL);
        event.register(ANIMATION_KEYBIND);
        event.register(PASSIVE_KEYBIND);
        event.register(DOMAIN_EXPANSION);
        event.register(EXTENSION_KEYBIND);
        event.register(TEST_ANIMATION);
        event.register(BURNOUT_KEY);
        event.register(WATER_WALKING);
        event.register(CURSED_ENERGY_SHIELD);
        event.register(DOMAIN_TYPE);
        event.register(CHANGE_TECHNIQUE);
        event.register(RELEASE_TECHNIQUE);
        event.register(CURSED_FISTS_KEYBIND);
    }

    @Mod.EventBusSubscriber({Dist.CLIENT})
    public static class KeyEventListener {
        @SubscribeEvent
        public static void onClientTick(TickEvent.ClientTickEvent event) {
            if (Minecraft.getInstance().screen == null) {
                WORLD_SLASH_KEY.consumeClick();
                ARMORY_OR_COPY.consumeClick();
                ALTAR_SELECTOR.consumeClick();
                KEY_WHEEL.consumeClick();
                ANIMATION_KEYBIND.consumeClick();
                PASSIVE_KEYBIND.consumeClick();
                DOMAIN_EXPANSION.consumeClick();
                EXTENSION_KEYBIND.consumeClick();
                TEST_ANIMATION.consumeClick();
                BURNOUT_KEY.consumeClick();
                WATER_WALKING.consumeClick();
                CURSED_ENERGY_SHIELD.consumeClick();
                DOMAIN_TYPE.consumeClick();
                RELEASE_TECHNIQUE.consumeClick();
                CURSED_FISTS_KEYBIND.consumeClick();
                CHANGE_TECHNIQUE.consumeClick();
            }
        }
    }
}
