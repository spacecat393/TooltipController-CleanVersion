package com.nali.list.key;

import com.nali.key.MixKeyBinding;
import com.nali.tc.system.Reference;
import org.lwjgl.input.Keyboard;

public class TcDown extends MixKeyBinding
{
    public static TcDown I;
    public TcDown(String name)
    {
        super(name, Keyboard.KEY_NUMPAD2, Reference.MOD_ID);
        I = this;
    }
}
