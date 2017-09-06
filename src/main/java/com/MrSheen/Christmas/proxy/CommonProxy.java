package com.MrSheen.Christmas.proxy;

import com.MrSheen.Christmas.handlers.RegistryHandler;

import net.minecraftforge.fml.common.event.*;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
    	RegistryHandler.Common();
    }

    public void init(FMLInitializationEvent event) {
    	
    }

    public void postInit(FMLPostInitializationEvent event) {
    	
    }

    public void serverStarting(FMLServerStartingEvent event) {
    	
    }

    public void serverStopping(FMLServerStoppingEvent event) {
    	
    }
}