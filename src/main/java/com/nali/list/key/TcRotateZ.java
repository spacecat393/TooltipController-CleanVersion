package com.nali.list.key;

import com.nali.key.MixKeyBinding;
import com.nali.tc.system.Reference;
import org.lwjgl.input.Keyboard;

public class TcRotateZ extends MixKeyBinding
{
    public static TcRotateZ I;
    public TcRotateZ(String name)
    {
        super(name, Keyboard.KEY_NUMPAD1, Reference.MOD_ID);
        I = this;
    }
}
