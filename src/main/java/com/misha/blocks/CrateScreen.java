package com.misha.blocks;

import com.misha.lavaplus.LavaPlus;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class CrateScreen extends AbstractContainerScreen<CrateContainer> {
    private ResourceLocation GUI = new ResourceLocation(LavaPlus.MODID, "textures/gui/crate_gui.png");
    private ResourceLocation FLAME= new ResourceLocation(LavaPlus.MODID, "textures/gui/flame.png");
    private ResourceLocation ARROW= new ResourceLocation(LavaPlus.MODID, "textures/gui/arrow.png");

    public CrateScreen(CrateContainer container, Inventory inv, Component name) {
        super(container, inv, name);
    }

    @Override
    public void render(PoseStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        this.renderBackground(matrixStack);
        super.render(matrixStack, mouseX, mouseY, partialTicks);
        this.renderTooltip(matrixStack, mouseX, mouseY);

    }

    @Override
    protected void renderLabels(PoseStack matrixStack, int mouseX, int mouseY) {
        int relX = (this.width - this.imageWidth) / 2;
        int relY = (this.height - this.imageHeight) / 2;
        Minecraft.getInstance().font.draw(matrixStack,"Crate",60.0F, 5.0F, 0x444444);

    }

    @Override
    protected void renderBg(PoseStack matrixStack, float partialTicks, int mouseX, int mouseY) {
        RenderSystem.setShaderTexture(0, GUI);
        int relX = (this.width - this.imageWidth) / 2;
        int relY = (this.height - this.imageHeight) / 2;
        this.blit(matrixStack, relX, relY, 0, 0, this.imageWidth+2, this.imageHeight);
        // System.out.println(menu.getActive());


    }
}
