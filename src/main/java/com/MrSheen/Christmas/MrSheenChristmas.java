package com.MrSheen.Christmas;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MrSheenChristmas.MODID, version = MrSheenChristmas.VERSION, name = MrSheenChristmas.NAME)
public class MrSheenChristmas {
    public static final String MODID = "mrsheenchristmas";
    public static final String VERSION = "1.0";
    public static final String NAME = "Mr Sheen's Christmas Mod"

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        // some example code
        System.out.println("DIRT BLOCK >> " + Blocks.DIRT.getUnlocalizedName());
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}