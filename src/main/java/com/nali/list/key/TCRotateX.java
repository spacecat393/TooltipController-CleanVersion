package com.nali.list.key;

import com.nali.key.MixKeyBinding;
import com.nali.tc.system.Reference;
import org.lwjgl.input.Keyboard;

public class TCRotateX extends MixKeyBinding
{
    public static TCRotateX TCROTATEX;
    public TCRotateX(String name)
    {
        super(name, Keyboard.KEY_NUMPAD7, Reference.MOD_ID);
        TCROTATEX = this;
    }
}
