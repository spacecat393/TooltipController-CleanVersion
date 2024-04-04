package com.nali.list.key;

import com.nali.key.MixKeyBinding;
import com.nali.tooltipcontroller.system.Reference;
import org.lwjgl.input.Keyboard;

public class TooltipcontrollerScaleUp extends MixKeyBinding
{
    public static TooltipcontrollerScaleUp I;
    public TooltipcontrollerScaleUp(String[] string_array)
    {
        super(string_array, Keyboard.KEY_NUMPAD9);
    }
}
