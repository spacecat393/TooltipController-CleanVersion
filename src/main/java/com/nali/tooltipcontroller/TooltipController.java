package com.nali.tooltipcontroller;

import com.nali.tooltipcontroller.system.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME)
public class TooltipController
{
    @Instance
    public static TooltipController I;
}
