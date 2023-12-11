package com.nali.list.key;

import com.nali.key.MixKeyBinding;
import com.nali.tc.system.Reference;
import org.lwjgl.input.Keyboard;

public class TCRight extends MixKeyBinding
{
    public static TCRight I;
    public TCRight(String name)
    {
        super(name, Keyboard.KEY_NUMPAD6, Reference.MOD_ID);
        I = this;
    }
}
