package com.nali.tooltipcontroller.mixin;

import com.nali.tooltipcontroller.key.KeyTick;
import net.minecraft.client.renderer.EntityRenderer;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntityRenderer.class)
public class MixinEntityRenderer
{
    @Inject(method = "updateCameraAndRender", at = @At(value = "INVOKE", target = "Lnet/minecraftforge/client/ForgeHooksClient;drawScreen(Lnet/minecraft/client/gui/GuiScreen;IIF)V", shift = At.Shift.BEFORE))
    private void nali_tooltipcontroller_updateCameraAndRenderHEAD(float partialTicks, long nanoTime, CallbackInfo ci)
    {
        GL11.glPushMatrix();
//        APPLY_FUNCTION.apply(null);

        GL11.glTranslated(KeyTick.X, KeyTick.Y, 0.0D);

        float s = KeyTick.S;
        GL11.glTranslated(KeyTick.PX, KeyTick.PY, 0.0D);
        GL11.glRotatef(KeyTick.RX, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef(KeyTick.RY, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(KeyTick.RZ, 0.0F, 0.0F, 1.0F);
        GL11.glScalef(s, s, 1.0F);
        GL11.glTranslated(-KeyTick.PX, -KeyTick.PY, 0.0D);
    }

    @Inject(method = "updateCameraAndRender", at = @At(value = "INVOKE", target = "Lnet/minecraftforge/client/ForgeHooksClient;drawScreen(Lnet/minecraft/client/gui/GuiScreen;IIF)V", shift = At.Shift.AFTER))
    private void nali_tooltipcontroller_updateCameraAndRenderTAIL(float partialTicks, long nanoTime, CallbackInfo ci)
    {
        GL11.glPopMatrix();
    }
}
