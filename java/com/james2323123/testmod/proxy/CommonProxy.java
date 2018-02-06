package com.james2323123.testmod.proxy;

import com.james2323123.testmod.block.ModBlock;
import com.james2323123.testmod.item.ModItem;
import com.james2323123.testmod.recipe.CraftingRecipe;
import com.james2323123.testmod.recipe.FurnanceRecipe;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent e) {
		ModItem.init();
		ModBlock.init();
		CraftingRecipe.init();
		FurnanceRecipe.init();
    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}
