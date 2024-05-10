package com.nali.list.key;

import com.nali.key.MixKeyBinding;
import com.nali.tooltipcontroller.key.KeyTick;
import org.lwjgl.input.Keyboard;

import static com.nali.system.Timing.TD;

public class TooltipcontrollerScaleDown extends MixKeyBinding
{
    public static int ID;
    public TooltipcontrollerScaleDown(String[] string_array, Integer key)
    {
        super(string_array, key == null ? Keyboard.KEY_NUMPAD3 : key);
    }

    public static void detect()
    {
        KeyTick.S -= 0.01F * TD;
    }
}
