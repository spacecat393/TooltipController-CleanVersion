package com.nali.list.key;

import com.nali.key.MixKeyBinding;
import com.nali.tooltipcontroller.key.KeyTick;
import org.lwjgl.input.Keyboard;

import static com.nali.system.Timing.TD;
import static com.nali.tooltipcontroller.key.KeyTick.STEP;

public class TooltipcontrollerUp extends MixKeyBinding
{
    public static int ID;
    public TooltipcontrollerUp(String[] string_array, Integer key)
    {
        super(string_array, key == null ? Keyboard.KEY_NUMPAD8 : key);
    }

    public static void detect()
    {
        KeyTick.Y -= STEP * TD;
    }
}
