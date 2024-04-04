package com.nali.list.function;

import com.nali.tooltipcontroller.key.KeyTick;
import org.lwjgl.input.Keyboard;

public class TooltipcontrollerFunction
{
    public TooltipcontrollerFunction()
    {
        KeyTick.FUNCTION = v -> KeyTick.run(Keyboard.getEventKey());
        KeyTick.APPLY_FUNCTION = v -> KeyTick.apply();
    }
}
