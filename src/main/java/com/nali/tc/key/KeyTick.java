package com.nali.tc.key;

import com.nali.list.key.*;
import com.nali.system.DataLoader;
import com.nali.tc.system.Reference;
import net.minecraftforge.client.event.RenderTooltipEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

import static com.nali.key.KeyTick.KEY_MAP;

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
            key == TCUp.I.getKeyCode() ||
            key == TCDown.I.getKeyCode() ||
            key == TCLeft.I.getKeyCode() ||
            key == TCRight.I.getKeyCode() ||
            key == TCScaleUp.I.getKeyCode() ||
            key == TCScaleDown.I.getKeyCode() ||
            key == TCRotateX.I.getKeyCode() ||
            key == TCRotateY.I.getKeyCode() ||
            key == TCRotateZ.I.getKeyCode()
        )
        {
            com.nali.key.KeyTick.addKey(key);
        }

        if (key == TCCenter.I.getKeyCode())
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
        if (KEY_MAP.containsKey(TCUp.I.getKeyCode()))
        {
            Y -= STEP * DataLoader.TD;
        }

        if (KEY_MAP.containsKey(TCDown.I.getKeyCode()))
        {
            Y += STEP * DataLoader.TD;
        }

        if (KEY_MAP.containsKey(TCLeft.I.getKeyCode()))
        {
            X -= STEP * DataLoader.TD;
        }

        if (KEY_MAP.containsKey(TCRight.I.getKeyCode()))
        {
            X += STEP * DataLoader.TD;
        }

        if (KEY_MAP.containsKey(TCScaleUp.I.getKeyCode()))
        {
            S += 0.1F * DataLoader.TD;
            setS();
        }

        if (KEY_MAP.containsKey(TCScaleDown.I.getKeyCode()))
        {
            S -= 0.1F * DataLoader.TD;
            setS();
        }

        if (KEY_MAP.containsKey(TCRotateX.I.getKeyCode()))
        {
            RX += 0.1F * DataLoader.TD;
        }

        if (KEY_MAP.containsKey(TCRotateY.I.getKeyCode()))
        {
            RY += 0.1F * DataLoader.TD;
        }

        if (KEY_MAP.containsKey(TCRotateZ.I.getKeyCode()))
        {
            RZ += 0.1F * DataLoader.TD;
        }
    }

    public static void setS()
    {
        if (S >= 1.0F)
        {
            STEP += 0.1F * DataLoader.TD;
        }
        else
        {
            STEP -= 0.1F * DataLoader.TD;
        }
    }

    @SubscribeEvent
    public static void setRenderTooltipEvent(RenderTooltipEvent.Pre rendertooltipevent)
    {
        PX = rendertooltipevent.getX();
        PY = rendertooltipevent.getY();
    }
}
