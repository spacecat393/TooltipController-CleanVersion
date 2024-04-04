package com.nali.list.key;

import com.nali.key.MixKeyBinding;
import com.nali.tooltipcontroller.system.Reference;
import org.lwjgl.input.Keyboard;

public class TooltipcontrollerDown extends MixKeyBinding
{
    public static TooltipcontrollerDown I;
    public TooltipcontrollerDown(String[] string_array)
    {
        super(string_array, Keyboard.KEY_NUMPAD2);
    }
}
