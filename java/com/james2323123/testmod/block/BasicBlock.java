package com.james2323123.testmod.block;

import com.james2323123.testmod.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BasicBlock extends Block{

	 protected BasicBlock(String unlocalizedName,float Hardness
			 , float Resistance, float LightLevel
			 , String HarvestTool, int HarvestLevel
			 , Material material,SoundType SoundType,CreativeTabs CreativeTabs) {
	        super(material);
	        this.setBlockName(unlocalizedName);
	        this.setBlockTextureName(Main.MODID + ":" + unlocalizedName);
	        this.setCreativeTab(CreativeTabs);
	        this.setHardness(Hardness);
	        this.setResistance(Resistance);
	        this.setLightLevel(LightLevel);
	        this.setHarvestLevel(HarvestTool, HarvestLevel);
	        this.setStepSound(SoundType);
	    }
	 protected BasicBlock(String unlocalizedName,float Hardness
			 , float Resistance, float LightLevel
			 , String HarvestTool, int HarvestLevel
			 , Material material,CreativeTabs CreativeTabs) {
	        super(material);
	        this.setBlockName(unlocalizedName);
	        this.setBlockTextureName(Main.MODID + ":" + unlocalizedName);
	        this.setCreativeTab(CreativeTabs);
	        this.setHardness(Hardness);
	        this.setResistance(Resistance);
	        this.setLightLevel(LightLevel);
	        this.setHarvestLevel(HarvestTool, HarvestLevel);
	    }

}
