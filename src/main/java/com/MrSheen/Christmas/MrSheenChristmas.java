package com.MrSheen.Christmas;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.util.logging.LogManager;
import java.util.logging.Logger;

@Mod(modid=Ref.MODID, version=Ref.VERSION, name=Ref.NAME)
public class MrSheenChristmas {
    public static final String MODID = "mrsheenchristmas";
    public static final String VERSION = "1.0";
    public static final String NAME = "Mr Sheen's Christmas Mod";

    public static MrSheenChristmas instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}