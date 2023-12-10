package com.nali.tc;

import com.nali.tc.system.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME)
public class TC
{
    @Instance
    public static TC MAIN;

    public static Logger LOGGER;

    @EventHandler
    public void onFMLPreInitializationEvent(FMLPreInitializationEvent fmlpreinitializationevent)
    {
        LOGGER = fmlpreinitializationevent.getModLog();
//        if (fmlpreinitializationevent.getSide().isClient())
//        {
//            KeyRegistry.set();
//            for (ModContainer mod : Loader.instance().getActiveModList())
//            {
//                if (mod.getModId().equals("invmove"))
//                {
//                    KeyTick.MOD = true;
//                }
//            }
//        }
    }
}
