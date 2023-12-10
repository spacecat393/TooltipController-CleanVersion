package com.nali.list.key;

import com.nali.key.MixKeyBinding;
import com.nali.tc.system.Reference;
import org.lwjgl.input.Keyboard;

public class TCDown extends MixKeyBinding
{
    public static TCDown TCDOWN;
    public TCDown(String name)
    {
        super(name, Keyboard.KEY_NUMPAD2, Reference.MOD_ID);
        TCDOWN = this;
    }
}
