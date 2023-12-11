package com.nali.list.key;

import com.nali.key.MixKeyBinding;
import com.nali.tc.system.Reference;
import org.lwjgl.input.Keyboard;

public class TCUp extends MixKeyBinding
{
    public static TCUp I;
    public TCUp(String name)
    {
        super(name, Keyboard.KEY_NUMPAD8, Reference.MOD_ID);
        I = this;
    }
}
