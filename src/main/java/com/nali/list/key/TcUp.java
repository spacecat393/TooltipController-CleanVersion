package com.nali.list.key;

import com.nali.key.MixKeyBinding;
import com.nali.tc.system.Reference;
import org.lwjgl.input.Keyboard;

public class TcUp extends MixKeyBinding
{
    public static TcUp I;
    public TcUp(String name)
    {
        super(name, Keyboard.KEY_NUMPAD8, Reference.MOD_ID);
        I = this;
    }
}
