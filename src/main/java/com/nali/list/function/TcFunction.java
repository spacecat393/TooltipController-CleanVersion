package com.nali.list.function;

import com.nali.tc.key.KeyTick;
import org.lwjgl.input.Keyboard;

public class TcFunction
{
    public TcFunction()
    {
        KeyTick.FUNCTION = v -> KeyTick.run(Keyboard.getEventKey());
        KeyTick.APPLY_FUNCTION = v -> KeyTick.apply();
    }
}
