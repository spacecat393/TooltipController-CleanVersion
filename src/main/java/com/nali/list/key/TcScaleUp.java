package com.nali.list.key;

import com.nali.key.MixKeyBinding;
import com.nali.tc.system.Reference;
import org.lwjgl.input.Keyboard;

public class TcScaleUp extends MixKeyBinding
{
    public static TcScaleUp I;
    public TcScaleUp(String name)
    {
        super(name, Keyboard.KEY_NUMPAD9, Reference.MOD_ID);
        I = this;
    }
}
