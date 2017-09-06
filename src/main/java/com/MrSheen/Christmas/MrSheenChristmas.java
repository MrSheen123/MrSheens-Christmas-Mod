package com.MrSheen.Christmas;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.util.logging.LogManager;
import java.util.logging.Logger;

import com.MrSheen.Christmas.proxy.CommonProxy;

@Mod(modid=Ref.MODID, version=Ref.VERSION, name=Ref.NAME)
public class MrSheenChristmas {
	
	@SidedProxy(clientSide = Ref.CLIENT_PROXY, serverSide = Ref.COMMON_PROXY)
	public static CommonProxy proxy;
    public static final String MODID = "mrsheenchristmas";
    public static final String VERSION = "1.0";
    public static final String NAME = "Mr Sheen's Christmas Mod";
    public static MrSheenChristmas instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
    	proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	proxy.postInit(event);
    }
}