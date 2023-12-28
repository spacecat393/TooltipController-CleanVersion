package com.nali.list.key;

import com.nali.key.MixKeyBinding;
import com.nali.tc.system.Reference;
import org.lwjgl.input.Keyboard;

public class TcScaleDown extends MixKeyBinding
{
    public static TcScaleDown I;
    public TcScaleDown(String name)
    {
        super(name, Keyboard.KEY_NUMPAD3, Reference.MOD_ID);
        I = this;
    }
}
