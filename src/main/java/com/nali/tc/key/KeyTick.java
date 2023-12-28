package com.nali.tc.key;

import com.nali.list.key.*;
import com.nali.system.DataLoader;
import com.nali.system.Timing;
import com.nali.tc.system.Reference;
import net.minecraftforge.client.event.RenderTooltipEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

import static com.nali.key.KeyTick.KEY_MAP;
import static com.nali.system.Timing.TD;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID, value = Side.CLIENT)
public class KeyTick
{
    public static int PX = 0;
    public static int PY = 0;
    public static float X = 0;
    public static float Y = 0;
    public static float RX = 0.0F;
    public static float RY = 0.0F;
    public static float RZ = 0.0F;
    public static float S = 1.0F;
    public static float STEP = 2.5F;

    public static void run(int key)
    {
        if
        (
            key == TcUp.I.getKeyCode() ||
            key == TcDown.I.getKeyCode() ||
            key == TcLeft.I.getKeyCode() ||
            key == TcRight.I.getKeyCode() ||
            key == TcScaleUp.I.getKeyCode() ||
            key == TcScaleDown.I.getKeyCode() ||
            key == TcRotateX.I.getKeyCode() ||
            key == TcRotateY.I.getKeyCode() ||
            key == TcRotateZ.I.getKeyCode()
        )
        {
            com.nali.key.KeyTick.addKey(key);
        }

        if (key == TcCenter.I.getKeyCode())
        {
            X = 0;
            Y = 0;
            S = 1.0F;
            RX = 0.0F;
            RY = 0.0F;
            RZ = 0.0F;
            STEP = 2.5F;
        }
    }

    public static void apply()
    {
        if (KEY_MAP.containsKey(TcUp.I.getKeyCode()))
        {
            Y -= STEP * TD;
        }

        if (KEY_MAP.containsKey(TcDown.I.getKeyCode()))
        {
            Y += STEP * TD;
        }

        if (KEY_MAP.containsKey(TcLeft.I.getKeyCode()))
        {
            X -= STEP * TD;
        }

        if (KEY_MAP.containsKey(TcRight.I.getKeyCode()))
        {
            X += STEP * TD;
        }

        if (KEY_MAP.containsKey(TcScaleUp.I.getKeyCode()))
        {
            S += 0.1F * TD;
            setS();
        }

        if (KEY_MAP.containsKey(TcScaleDown.I.getKeyCode()))
        {
            S -= 0.1F * TD;
            setS();
        }

        if (KEY_MAP.containsKey(TcRotateX.I.getKeyCode()))
        {
            RX += 0.1F * TD;
        }

        if (KEY_MAP.containsKey(TcRotateY.I.getKeyCode()))
        {
            RY += 0.1F * TD;
        }

        if (KEY_MAP.containsKey(TcRotateZ.I.getKeyCode()))
        {
            RZ += 0.1F * TD;
        }
    }

    public static void setS()
    {
        if (S >= 1.0F)
        {
            STEP += 0.1F * TD;
        }
        else
        {
            STEP -= 0.1F * TD;
        }
    }

    @SubscribeEvent
    public static void setRenderTooltipEvent(RenderTooltipEvent.Pre rendertooltipevent)
    {
        PX = rendertooltipevent.getX();
        PY = rendertooltipevent.getY();
    }
}
