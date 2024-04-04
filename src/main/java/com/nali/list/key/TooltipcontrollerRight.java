package com.nali.list.key;

import com.nali.key.MixKeyBinding;
import com.nali.tooltipcontroller.system.Reference;
import org.lwjgl.input.Keyboard;

public class TooltipcontrollerRight extends MixKeyBinding
{
    public static TooltipcontrollerRight I;
    public TooltipcontrollerRight(String[] string_array)
    {
        super(string_array, Keyboard.KEY_NUMPAD6);
    }
}
