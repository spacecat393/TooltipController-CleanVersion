package com.nali.list.key;

import com.nali.key.MixKeyBinding;
import com.nali.tooltipcontroller.key.KeyTick;
import org.lwjgl.input.Keyboard;

import static com.nali.system.Timing.TD;
import static com.nali.tooltipcontroller.key.KeyTick.STEP;

public class TooltipcontrollerDown extends MixKeyBinding
{
    public static int ID;
    public TooltipcontrollerDown(String[] string_array, Integer key)
    {
        super(string_array, key == null ? Keyboard.KEY_NUMPAD2 : key);
    }

    public static void detect()
    {
        KeyTick.Y += STEP * TD;
    }
}
