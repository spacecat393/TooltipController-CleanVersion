package com.nali.list.key;

import com.nali.key.MixKeyBinding;
import com.nali.tooltipcontroller.system.Reference;
import org.lwjgl.input.Keyboard;

public class TooltipcontrollerRotateX extends MixKeyBinding
{
    public static TooltipcontrollerRotateX I;
    public TooltipcontrollerRotateX(String[] string_array)
    {
        super(string_array, Keyboard.KEY_NUMPAD7);
    }
}
