package com.nali.list.key;

import com.nali.key.MixKeyBinding;
import org.lwjgl.input.Keyboard;

public class TooltipcontrollerScaleDown extends MixKeyBinding
{
    public static TooltipcontrollerScaleDown I;
    public TooltipcontrollerScaleDown(String[] string_array)
    {
        super(string_array, Keyboard.KEY_NUMPAD3);
    }
}
