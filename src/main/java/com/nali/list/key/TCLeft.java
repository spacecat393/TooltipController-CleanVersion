package com.nali.list.key;

import com.nali.key.MixKeyBinding;
import com.nali.tc.system.Reference;
import org.lwjgl.input.Keyboard;

public class TCLeft extends MixKeyBinding
{
    public static TCLeft I;
    public TCLeft(String name)
    {
        super(name, Keyboard.KEY_NUMPAD4, Reference.MOD_ID);
        I = this;
    }
}
