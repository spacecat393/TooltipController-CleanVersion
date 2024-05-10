package com.nali.list.key;

import com.nali.key.MixKeyBinding;
import com.nali.tooltipcontroller.key.KeyTick;
import org.lwjgl.input.Keyboard;

import static com.nali.system.Timing.TD;

public class TooltipcontrollerRotateX extends MixKeyBinding
{
    public static int ID;
    public TooltipcontrollerRotateX(String[] string_array, Integer key)
    {
        super(string_array, key == null ? Keyboard.KEY_NUMPAD7 : key);
    }

    public static void detect()
    {
        KeyTick.RX += 1.1F * TD;
    }
}
