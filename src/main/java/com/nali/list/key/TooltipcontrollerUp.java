package com.nali.list.key;

import com.nali.key.MixKeyBinding;
import com.nali.tooltipcontroller.system.Reference;
import org.lwjgl.input.Keyboard;

public class TooltipcontrollerUp extends MixKeyBinding
{
    public static TooltipcontrollerUp I;
    public TooltipcontrollerUp(String[] string_array)
    {
        super(string_array, Keyboard.KEY_NUMPAD8);
    }
}
