package com.james2323123.testmod.block;

import com.james2323123.testmod.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class MultiTextureBlock extends Block {

	protected MultiTextureBlock(String unlocalizedName,float Hardness
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
	protected MultiTextureBlock(String unlocalizedName,float Hardness
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
	public IIcon[] icons = new IIcon[6];
	@Override
	public void registerBlockIcons(IIconRegister reg) {
	    for (int i = 0; i < 6; i ++) {
	        this.icons[i] = reg.registerIcon(this.textureName + "_" + i);
	    }
	}
	@Override
	public IIcon getIcon(int side, int meta) {
	    return this.icons[side];
	}
}
