package com.nali.list.key;

import com.nali.key.MixKeyBinding;
import com.nali.tc.system.Reference;
import org.lwjgl.input.Keyboard;

public class TCCenter extends MixKeyBinding
{
    public static TCCenter I;
    public TCCenter(String name)
    {
        super(name, Keyboard.KEY_NUMPAD5, Reference.MOD_ID);
        I = this;
    }
}
