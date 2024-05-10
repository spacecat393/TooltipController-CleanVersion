//package com.nali.tooltipcontroller.mixin;
//
//import net.minecraft.client.Minecraft;
//import org.spongepowered.asm.mixin.Mixin;
//import org.spongepowered.asm.mixin.injection.At;
//import org.spongepowered.asm.mixin.injection.Inject;
//import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
//
//import static com.nali.tooltipcontroller.key.KeyTick.FUNCTION;
//
//@Mixin(Minecraft.class)
//public abstract class MixinMinecraft
//{
//    @Inject(method = "dispatchKeypresses", at = @At(value = "HEAD"))
//    private void dispatchKeypresses(CallbackInfo callbackinfo)
//    {
//        FUNCTION.apply(null);
//    }
//}
