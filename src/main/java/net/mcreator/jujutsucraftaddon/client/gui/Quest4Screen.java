package net.mcreator.jujutsucraftaddon.client.gui;

import com.mojang.blaze3d.systems.RenderSystem;
import net.mcreator.jujutsucraftaddon.JujutsucraftaddonMod;
import net.mcreator.jujutsucraftaddon.network.Quest4ButtonMessage;
import net.mcreator.jujutsucraftaddon.world.inventory.Quest4Menu;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

import java.util.HashMap;

public class Quest4Screen extends AbstractContainerScreen<Quest4Menu> {
    private final static HashMap<String, Object> guistate = Quest4Menu.guistate;
    private final Level world;
    private final int x, y, z;
    private final Player entity;
    Button button_continue;
    Button button_reset;

    public Quest4Screen(Quest4Menu container, Inventory inventory, Component text) {
        super(container, inventory, text);
        this.world = container.world;
        this.x = container.x;
        this.y = container.y;
        this.z = container.z;
        this.entity = container.entity;
        this.imageWidth = 176;
        this.imageHeight = 166;
    }

    private static final ResourceLocation texture = new ResourceLocation("jujutsucraftaddon:textures/screens/quest_4.png");

    @Override
    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
        this.renderBackground(guiGraphics);
        super.render(guiGraphics, mouseX, mouseY, partialTicks);
        this.renderTooltip(guiGraphics, mouseX, mouseY);
    }

    @Override
    protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
        RenderSystem.setShaderColor(1, 1, 1, 1);
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
        RenderSystem.disableBlend();
    }

    @Override
    public boolean keyPressed(int key, int b, int c) {
        if (key == 256) {
            this.minecraft.player.closeContainer();
            return true;
        }
        return super.keyPressed(key, b, c);
    }

    @Override
    protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
        guiGraphics.drawString(this.font, Component.translatable("gui.jujutsucraftaddon.quest_4.label_history_mode"), 43, 16, -12829636, false);
        guiGraphics.drawString(this.font, Component.translatable("gui.jujutsucraftaddon.quest_4.label_chapter_1_hidden_inventory_arc"), 16, 35, -12829636, false);
        guiGraphics.drawString(this.font, Component.translatable("gui.jujutsucraftaddon.quest_4.label_beat_toji_with_geto_and_gojo"), 5, 56, -12829636, false);
        guiGraphics.drawString(this.font, Component.translatable("gui.jujutsucraftaddon.quest_4.label_miguel_vs_gojo"), 54, 76, -12829636, false);
    }

    @Override
    public void init() {
        super.init();
        button_continue = Button.builder(Component.translatable("gui.jujutsucraftaddon.quest_4.button_continue"), e -> {
            if (true) {
                JujutsucraftaddonMod.PACKET_HANDLER.sendToServer(new Quest4ButtonMessage(0, x, y, z));
                Quest4ButtonMessage.handleButtonAction(entity, 0, x, y, z);
            }
        }).bounds(this.leftPos + 51, this.topPos + 99, 67, 20).build();
        guistate.put("button:button_continue", button_continue);
        this.addRenderableWidget(button_continue);
        button_reset = Button.builder(Component.translatable("gui.jujutsucraftaddon.quest_4.button_reset"), e -> {
            if (true) {
                JujutsucraftaddonMod.PACKET_HANDLER.sendToServer(new Quest4ButtonMessage(1, x, y, z));
                Quest4ButtonMessage.handleButtonAction(entity, 1, x, y, z);
            }
        }).bounds(this.leftPos + 57, this.topPos + 130, 51, 20).build();
        guistate.put("button:button_reset", button_reset);
        this.addRenderableWidget(button_reset);
    }
}
