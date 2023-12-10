package com.nali.list.key;

import com.nali.key.MixKeyBinding;
import com.nali.tc.system.Reference;
import org.lwjgl.input.Keyboard;

public class TCRotateY extends MixKeyBinding
{
    public static TCRotateY TCROTATEY;
    public TCRotateY(String name)
    {
        super(name, Keyboard.KEY_NUMPAD0, Reference.MOD_ID);
        TCROTATEY = this;
    }
}
