package com.MrSheen.Christmas;

import com.MrSheen.Christmas.item.ModItems;
import com.MrSheen.Christmas.tab.CreativeChristmasTab;
import net.minecraft.creativetab.CreativeTabs;
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
    public static final String NAME = "Mr Sheen's Christmas Mod";

    @Mod.Instance
    public static MrSheenChristmas instance;

    public static CreativeChristmasTab tabChristmas;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        tabChristmas = new CreativeChristmasTab(CreativeTabs.getNextID(), "tab_Christmas");
        ModItems.preInit();
        ModItems.registerItems();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}