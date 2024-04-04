package com.nali.list.key;

import com.nali.key.MixKeyBinding;
import com.nali.tooltipcontroller.system.Reference;
import org.lwjgl.input.Keyboard;

public class TooltipcontrollerLeft extends MixKeyBinding
{
    public static TooltipcontrollerLeft I;
    public TooltipcontrollerLeft(String[] string_array)
    {
        super(string_array, Keyboard.KEY_NUMPAD4);
    }
}
