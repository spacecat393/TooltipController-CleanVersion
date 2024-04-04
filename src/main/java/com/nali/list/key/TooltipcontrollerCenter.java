package com.nali.list.key;

import com.nali.key.MixKeyBinding;
import org.lwjgl.input.Keyboard;

public class TooltipcontrollerCenter extends MixKeyBinding
{
    public static TooltipcontrollerCenter I;
    public TooltipcontrollerCenter(String[] string_array)
    {
        super(string_array, Keyboard.KEY_NUMPAD5);
    }
}
