package com.nali.list.key;

import com.nali.key.MixKeyBinding;
import com.nali.tc.system.Reference;
import org.lwjgl.input.Keyboard;

public class TcRight extends MixKeyBinding
{
    public static TcRight I;
    public TcRight(String name)
    {
        super(name, Keyboard.KEY_NUMPAD6, Reference.MOD_ID);
        I = this;
    }
}
