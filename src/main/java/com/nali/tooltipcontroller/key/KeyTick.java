package com.nali.tooltipcontroller.key;

import com.nali.tooltipcontroller.system.Reference;
import net.minecraftforge.client.event.RenderTooltipEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID, value = Side.CLIENT)
public class KeyTick
{
//    public static Function FUNCTION = (v) -> v;
//    public static Function APPLY_FUNCTION = (v) -> v;
    public static int PX = 0;
    public static int PY = 0;
    public static float X = 0;
    public static float Y = 0;
    public static float RX = 0.0F;
    public static float RY = 0.0F;
    public static float RZ = 0.0F;
    public static float S = 1.0F;
    public static float STEP = 2.5F;

//    public static Void run(int key)
//    {
////        if
////        (
////            key == TooltipcontrollerUp.I.getKeyCode() ||
////            key == TooltipcontrollerDown.I.getKeyCode() ||
////            key == TooltipcontrollerLeft.I.getKeyCode() ||
////            key == TooltipcontrollerRight.I.getKeyCode() ||
////            key == TooltipcontrollerScaleUp.I.getKeyCode() ||
////            key == TooltipcontrollerScaleDown.I.getKeyCode() ||
////            key == TooltipcontrollerRotateX.I.getKeyCode() ||
////            key == TooltipcontrollerRotateY.I.getKeyCode() ||
////            key == TooltipcontrollerRotateZ.I.getKeyCode()
////        )
////        {
////            com.nali.key.KeyTick.addKey(key);
////        }
//
////        if (key == TooltipcontrollerCenter.I.getKeyCode())
////        {
////            X = 0;
////            Y = 0;
////            S = 1.0F;
////            RX = 0.0F;
////            RY = 0.0F;
////            RZ = 0.0F;
////            STEP = 2.5F;
////        }
//
//        return null;
//    }

//    public static Void apply()
//    {
//        if (KEY_MAP.containsKey(TooltipcontrollerUp.I.getKeyCode()))
//        {
//            Y -= STEP * TD;
//        }
//
//        if (KEY_MAP.containsKey(TooltipcontrollerDown.I.getKeyCode()))
//        {
//            Y += STEP * TD;
//        }
//
//        if (KEY_MAP.containsKey(TooltipcontrollerLeft.I.getKeyCode()))
//        {
//            X -= STEP * TD;
//        }
//
//        if (KEY_MAP.containsKey(TooltipcontrollerRight.I.getKeyCode()))
//        {
//            X += STEP * TD;
//        }
//
//        if (KEY_MAP.containsKey(TooltipcontrollerScaleUp.I.getKeyCode()))
//        {
//            S += 0.01F * TD;
////            setS();
//        }
//
//        if (KEY_MAP.containsKey(TooltipcontrollerScaleDown.I.getKeyCode()))
//        {
//            S -= 0.01F * TD;
////            setS();
//        }
//
//        if (KEY_MAP.containsKey(TooltipcontrollerRotateX.I.getKeyCode()))
//        {
//            RX += 1.1F * TD;
//        }
//
//        if (KEY_MAP.containsKey(TooltipcontrollerRotateY.I.getKeyCode()))
//        {
//            RY += 1.1F * TD;
//        }
//
//        if (KEY_MAP.containsKey(TooltipcontrollerRotateZ.I.getKeyCode()))
//        {
//            RZ += 1.1F * TD;
//        }
//
//        return null;
//    }

//    public static void setS()
//    {
//        if (S >= 1.0F)
//        {
//            STEP += 1.1F * TD;
//        }
//        else
//        {
//            STEP -= 1.1F * TD;
//        }
//    }

    @SubscribeEvent
    public static void setRenderTooltipEvent(RenderTooltipEvent.Pre event)
    {
        PX = event.getX();
        PY = event.getY();
    }
}
