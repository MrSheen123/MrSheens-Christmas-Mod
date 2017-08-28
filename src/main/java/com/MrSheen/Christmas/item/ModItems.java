package com.MrSheen.Christmas.item;

import com.MrSheen.Christmas.MrSheenChristmas;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
@SuppressWarnings("WeakerAccess")

public class ModItems {

    public static Item Ribbon;

    public static void init() {

        Ribbon = new Item().setUnlocalizedName("Ribbon").setCreativeTab(MrSheenChristmas.tabChristmas);

        registerItems();
    }

    public static void registerItems() {
        GameRegistry.register(Ribbon);
    }

    public static void registerRenders() {
        registerRender(Ribbon);
    }

    public static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(MrSheenChristmas.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));

    }
}
