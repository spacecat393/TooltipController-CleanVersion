package com.nali.list.key;

import com.nali.key.MixKeyBinding;
import com.nali.tc.system.Reference;
import org.lwjgl.input.Keyboard;

public class TCScaleDown extends MixKeyBinding
{
    public static TCScaleDown TCSCALEDOWN;
    public TCScaleDown(String name)
    {
        super(name, Keyboard.KEY_NUMPAD3, Reference.MOD_ID);
        TCSCALEDOWN = this;
    }
}
