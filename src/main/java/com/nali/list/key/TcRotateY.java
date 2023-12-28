package com.nali.list.key;

import com.nali.key.MixKeyBinding;
import com.nali.tc.system.Reference;
import org.lwjgl.input.Keyboard;

public class TcRotateY extends MixKeyBinding
{
    public static TcRotateY I;
    public TcRotateY(String name)
    {
        super(name, Keyboard.KEY_NUMPAD0, Reference.MOD_ID);
        I = this;
    }
}
