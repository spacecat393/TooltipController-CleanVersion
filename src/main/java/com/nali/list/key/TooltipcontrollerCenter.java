package com.nali.list.key;

import com.nali.key.MixKeyBinding;
import com.nali.tooltipcontroller.key.KeyTick;
import org.lwjgl.input.Keyboard;

public class TooltipcontrollerCenter extends MixKeyBinding
{
    public static int ID;
    public TooltipcontrollerCenter(String[] string_array, Integer key)
    {
        super(string_array, key == null ? Keyboard.KEY_NUMPAD5 : key);
    }

    public static void detect()
    {
        KeyTick.X = 0;
        KeyTick.Y = 0;
        KeyTick.S = 1.0F;
        KeyTick.RX = 0.0F;
        KeyTick.RY = 0.0F;
        KeyTick.RZ = 0.0F;
        KeyTick.STEP = 2.5F;
    }
}
