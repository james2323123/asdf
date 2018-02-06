package com.james2323123.testmod.item;

import com.james2323123.testmod.Main;

import net.minecraft.item.ItemSword;

public class ModSword extends ItemSword {

	public ModSword(String unlocalizedName,ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Main.MODID + ":" + unlocalizedName);
	}
	

}
