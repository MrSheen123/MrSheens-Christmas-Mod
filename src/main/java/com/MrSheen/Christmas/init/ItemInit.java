package com.MrSheen.Christmas.init;

import com.MrSheen.Christmas.Ref;
import com.MrSheen.Christmas.init.items.CustomIngot;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.*;
import net.minecraftforge.client.model.ModelLoader;

public class ItemInit {
	
	public static Item chocolate_bar;
	
	public static void init()
	{
		chocolate_bar = new CustomIngot("chocolate_bar");
	}

	public static void register()
	{
		registerItem(chocolate_bar);
	}
	 
	public static void registerItem(Item item)
	{
		ForgeRegistries.ITEMS.register(item);
		
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}
