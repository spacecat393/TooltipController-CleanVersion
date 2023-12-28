package com.nali.list.key;

import com.nali.key.MixKeyBinding;
import com.nali.tc.system.Reference;
import org.lwjgl.input.Keyboard;

public class TcRotateX extends MixKeyBinding
{
    public static TcRotateX I;
    public TcRotateX(String name)
    {
        super(name, Keyboard.KEY_NUMPAD7, Reference.MOD_ID);
        I = this;
    }
}
