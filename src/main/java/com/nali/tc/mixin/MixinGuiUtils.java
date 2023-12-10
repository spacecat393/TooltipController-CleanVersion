package com.nali.tc.mixin;

import com.nali.tc.key.KeyTick;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.client.config.GuiUtils;
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
//    private static final FloatBuffer FLOATBUFFER = ByteBuffer.allocateDirect(16 << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();

    @Inject(method = "drawHoveringText(Lnet/minecraft/item/ItemStack;Ljava/util/List;IIIIILnet/minecraft/client/gui/FontRenderer;)V", at = @At("HEAD"), remap = false)
    private static void drawHoveringText(@Nonnull final ItemStack stack, List<String> textLines, int mouseX, int mouseY, int screenWidth, int screenHeight, int maxTextWidth, FontRenderer font, CallbackInfo callbackinfo)
    {
        KeyTick.apply();
//        GL11.glPopMatrix();
//        GlStateManager.popMatrix();

//        GL11.glTranslated(KeyTick.X, KeyTick.Y, 0.0D);
        GlStateManager.translate(KeyTick.X, KeyTick.Y, 0.0D);

//        GL11.glPushMatrix();
//        GlStateManager.pushMatrix();

        float s = KeyTick.S;
        int px = KeyTick.PX;
        int py = KeyTick.PY;
//        GL11.glTranslated(px, py, 0.0D);
        GlStateManager.translate(px, py, 0.0D);
//        setFloatbuffer();
//        GL11.glMultMatrix(FLOATBUFFER);
        GlStateManager.rotate(fromXYZ(KeyTick.RX, KeyTick.RY, KeyTick.RZ));
//        GL11.glScalef(s, s, 1.0F);
        GlStateManager.scale(s, s, 1.0F);
//        GL11.glTranslated(-px, -py, 0.0D);
        GlStateManager.translate(-px, -py, 0.0D);
    }

    private static Quaternion fromXYZ(float x, float y, float z)
    {
        Quaternion quaternion = new Quaternion(0.0F, 0.0F, 0.0F, 1.0F);
        mul(new Quaternion((float)Math.sin((double)(x / 2.0F)), 0.0F, 0.0F, (float)Math.cos((double)(x / 2.0F))), quaternion);
        mul(new Quaternion(0.0F, (float)Math.sin((double)(y / 2.0F)), 0.0F, (float)Math.cos((double)(y / 2.0F))), quaternion);
        mul(new Quaternion(0.0F, 0.0F, (float)Math.sin((double)(z / 2.0F)), (float)Math.cos((double)(z / 2.0F))), quaternion);
        return quaternion;
    }

    private static void mul(Quaternion q, Quaternion oq)
    {
        float f = oq.x;
        float f1 = oq.y;
        float f2 = oq.z;
        float f3 = oq.w;
        float f4 = q.x;
        float f5 = q.y;
        float f6 = q.z;
        float f7 = q.w;
        oq.x = f3 * f4 + f * f7 + f1 * f6 - f2 * f5;
        oq.y = f3 * f5 - f * f6 + f1 * f7 + f2 * f4;
        oq.z = f3 * f6 + f * f5 - f1 * f4 + f2 * f7;
        oq.w = f3 * f7 - f * f4 - f1 * f5 - f2 * f6;
    }

//    private static void setFloatbuffer()
//    {
//        Quaternion quaternion = fromXYZ(KeyTick.RX, KeyTick.RY, KeyTick.RZ);
//        FLOATBUFFER.clear();
//        float f = quaternion.x * quaternion.x;
//        float f1 = quaternion.x * quaternion.y;
//        float f2 = quaternion.x * quaternion.z;
//        float f3 = quaternion.x * quaternion.w;
//        float f4 = quaternion.y * quaternion.y;
//        float f5 = quaternion.y * quaternion.z;
//        float f6 = quaternion.y * quaternion.w;
//        float f7 = quaternion.z * quaternion.z;
//        float f8 = quaternion.z * quaternion.w;
//        FLOATBUFFER.put(1.0F - 2.0F * (f4 + f7));
//        FLOATBUFFER.put(2.0F * (f1 + f8));
//        FLOATBUFFER.put(2.0F * (f2 - f6));
//        FLOATBUFFER.put(0.0F);
//        FLOATBUFFER.put(2.0F * (f1 - f8));
//        FLOATBUFFER.put(1.0F - 2.0F * (f + f7));
//        FLOATBUFFER.put(2.0F * (f5 + f3));
//        FLOATBUFFER.put(0.0F);
//        FLOATBUFFER.put(2.0F * (f2 + f6));
//        FLOATBUFFER.put(2.0F * (f5 - f3));
//        FLOATBUFFER.put(1.0F - 2.0F * (f + f4));
//        FLOATBUFFER.put(0.0F);
//        FLOATBUFFER.put(0.0F);
//        FLOATBUFFER.put(0.0F);
//        FLOATBUFFER.put(0.0F);
//        FLOATBUFFER.put(1.0F);
////        FLOATBUFFER.rewind();
//        FLOATBUFFER.flip();
//    }
}
