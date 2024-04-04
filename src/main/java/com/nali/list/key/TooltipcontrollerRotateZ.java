package com.nali.list.key;

import com.nali.key.MixKeyBinding;
import com.nali.tooltipcontroller.system.Reference;
import org.lwjgl.input.Keyboard;

public class TooltipcontrollerRotateZ extends MixKeyBinding
{
    public static TooltipcontrollerRotateZ I;
    public TooltipcontrollerRotateZ(String[] string_array)
    {
        super(string_array, Keyboard.KEY_NUMPAD1);
    }
}
