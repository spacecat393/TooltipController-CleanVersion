package com.nali.tc;

import com.nali.tc.system.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME)
public class TC
{
    @Instance
    public static TC I;

    public static Logger LOGGER = LogManager.getLogger(Reference.MOD_ID);
}
