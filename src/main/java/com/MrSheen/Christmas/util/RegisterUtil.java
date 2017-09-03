package com.MrSheen.Christmas.util;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

public class RegisterUtil {
    public static void registerAll(FMLPreInitializationEvent event){

    }

    private static void registerBlocks(FMLPreInitializationEvent event, Block...blocks){
        for(Block block : blocks) {
            final ItemBlock itemBlock = new ItemBlock(block);
            if(event.getSide() == Side.CLIENT){
                GameRegistry.register(block);
                GameRegistry.register(itemBlock. block.getRegistryName());
                ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block),
                        0,
                        new ModelResourceLocation(
                                block.getRegistryName(),
                                "inventory"));
            }
        }
    }

    private static void registerItems(FMLPreInitializationEvent event, Item...items){

    }
}
