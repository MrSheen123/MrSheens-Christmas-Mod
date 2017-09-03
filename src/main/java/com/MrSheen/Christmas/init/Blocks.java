package com.MrSheen.Christmas.init;

import com.MrSheen.Christmas.blocks.BlockChristmasPresent;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Blocks {
    public static final Block ChristmasBlock = new BlockChristmasPresent(
            "christmas_present",
            Material.CLOTH,
            CreativeTabs.DECORATIONS
            5F,
            15F,
            "hand",
            1);

}
