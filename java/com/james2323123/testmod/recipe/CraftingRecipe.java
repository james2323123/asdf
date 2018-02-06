package com.james2323123.testmod.recipe;

import com.james2323123.testmod.block.ModBlock;
import com.james2323123.testmod.item.ModItem;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CraftingRecipe {
	public static void init() {
		GameRegistry.addRecipe(new ItemStack(ModBlock.asdfBlock), new Object[] {"##", "##", '#', ModItem.asdf});
		GameRegistry.addRecipe(new ItemStack(ModBlock.asdfBlock), new Object[] {"###", "###", "###" , '#',ModBlock.qwerBlock });
		GameRegistry.addRecipe(new ItemStack(ModBlock.qwerBlock), new Object[] {"###", "###", "###" , '#',Items.nether_star});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItem.asdf), new Object[] {new ItemStack(Items.dye,1,4),new ItemStack(Items.dye,1,4),new ItemStack(Items.dye,1,4),new ItemStack(Items.dye,1,4)});
	}
}

