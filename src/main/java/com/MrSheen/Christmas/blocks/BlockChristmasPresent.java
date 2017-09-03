package com.MrSheen.Christmas.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockChristmasPresent extends BlockBase {
    public BlockChristmasPresent(String name,
                                 Material mat,
                                 CreativeTabs tab,
                                 float hardness,
                                 float resistance,
                                 String tool,
                                 int harvest) {
        super(name, mat, tab, hardness, resistance, tool, harvest);
    }
}
