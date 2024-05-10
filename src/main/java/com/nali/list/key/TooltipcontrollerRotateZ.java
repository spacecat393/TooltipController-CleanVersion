package com.nali.list.key;

import com.nali.key.MixKeyBinding;
import com.nali.tooltipcontroller.key.KeyTick;
import org.lwjgl.input.Keyboard;

import static com.nali.system.Timing.TD;

public class TooltipcontrollerRotateZ extends MixKeyBinding
{
    public static int ID;
    public TooltipcontrollerRotateZ(String[] string_array, Integer key)
    {
        super(string_array, key == null ? Keyboard.KEY_NUMPAD1 : key);
    }

    public static void detect()
    {
        KeyTick.RZ += 1.1F * TD;
    }
}
