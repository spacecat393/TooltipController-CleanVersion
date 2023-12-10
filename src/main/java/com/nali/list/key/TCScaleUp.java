package com.nali.list.key;

import com.nali.key.MixKeyBinding;
import com.nali.tc.system.Reference;
import org.lwjgl.input.Keyboard;

public class TCScaleUp extends MixKeyBinding
{
    public static TCScaleUp TCSCALEUP;
    public TCScaleUp(String name)
    {
        super(name, Keyboard.KEY_NUMPAD9, Reference.MOD_ID);
        TCSCALEUP = this;
    }
}
