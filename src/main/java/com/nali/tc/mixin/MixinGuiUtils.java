package com.nali.tc.mixin;

import com.nali.tc.key.KeyTick;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.client.config.GuiUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Quaternion;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import javax.annotation.Nonnull;
import java.util.List;

@Mixin(GuiUtils.class)
public abstract class MixinGuiUtils
{
    @Inject(method = "drawHoveringText(Lnet/minecraft/item/ItemStack;Ljava/util/List;IIIIILnet/minecraft/client/gui/FontRenderer;)V", at = @At("HEAD"), remap = false)
    private static void drawHoveringTextHEAD(@Nonnull final ItemStack stack, List<String> textLines, int mouseX, int mouseY, int screenWidth, int screenHeight, int maxTextWidth, FontRenderer font, CallbackInfo callbackinfo)
    {
        GL11.glPushMatrix();
        KeyTick.apply();

        GL11.glTranslated(KeyTick.X, KeyTick.Y, 0.0D);

        float s = KeyTick.S;
        GL11.glTranslated(KeyTick.PX, KeyTick.PY, 0.0D);
        GL11.glRotatef(KeyTick.RX, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef(KeyTick.RY, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(KeyTick.RZ, 0.0F, 0.0F, 1.0F);
        GL11.glScalef(s, s, 1.0F);
        GL11.glTranslated(-KeyTick.PX, -KeyTick.PY, 0.0D);
    }

    @Inject(method = "drawHoveringText(Lnet/minecraft/item/ItemStack;Ljava/util/List;IIIIILnet/minecraft/client/gui/FontRenderer;)V", at = @At("TAIL"), remap = false)
    private static void drawHoveringTextTAIL(@Nonnull final ItemStack stack, List<String> textLines, int mouseX, int mouseY, int screenWidth, int screenHeight, int maxTextWidth, FontRenderer font, CallbackInfo callbackinfo)
    {
        GL11.glPopMatrix();
    }
}
