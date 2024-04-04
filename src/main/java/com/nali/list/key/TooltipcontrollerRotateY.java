package com.nali.list.key;

import com.nali.key.MixKeyBinding;
import com.nali.tooltipcontroller.system.Reference;
import org.lwjgl.input.Keyboard;

public class TooltipcontrollerRotateY extends MixKeyBinding
{
    public static TooltipcontrollerRotateY I;
    public TooltipcontrollerRotateY(String[] string_array)
    {
        super(string_array, Keyboard.KEY_NUMPAD0);
    }
}
