package com.nali.tc.mixin;

import com.nali.tc.key.KeyTick;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public abstract class MixinMinecraft
{
    @Inject(method = "dispatchKeypresses", at = @At(value = "HEAD"))
    private void dispatchKeypresses(CallbackInfo callbackinfo)
    {
//        if (KeyTick.MOD)
//        {
        KeyTick.run(Keyboard.getEventKey());
//        }
    }
}
