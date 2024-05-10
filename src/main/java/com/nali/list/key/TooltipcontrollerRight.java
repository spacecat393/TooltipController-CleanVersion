package com.nali.list.key;

import com.nali.key.MixKeyBinding;
import com.nali.tooltipcontroller.key.KeyTick;
import org.lwjgl.input.Keyboard;

import static com.nali.system.Timing.TD;
import static com.nali.tooltipcontroller.key.KeyTick.STEP;

public class TooltipcontrollerRight extends MixKeyBinding
{
    public static int ID;
    public TooltipcontrollerRight(String[] string_array, Integer key)
    {
        super(string_array, key == null ? Keyboard.KEY_NUMPAD6 : key);
    }

    public static void detect()
    {
        KeyTick.X += STEP * TD;
    }
}
