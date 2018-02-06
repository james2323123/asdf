package com.james2323123.testmod.block;

import java.util.List;

import com.james2323123.testmod.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class MetaBlockWithMultiTexture extends Block {
	private int maxMeta = 0;
	public IIcon[][] icons;
	protected MetaBlockWithMultiTexture(String unlocalizedName,float Hardness
			, float Resistance, float LightLevel
			, String HarvestTool, int HarvestLevel
			, Material material,SoundType SoundType,CreativeTabs CreativeTabs,int maxMeta) {
		super(material);
		this.setBlockName(unlocalizedName);
		this.setBlockTextureName(Main.MODID + ":" + unlocalizedName);
		this.setCreativeTab(CreativeTabs);
		this.setHardness(Hardness);
		this.setResistance(Resistance);
		this.setLightLevel(LightLevel);
		this.setHarvestLevel(HarvestTool, HarvestLevel);
		this.setStepSound(SoundType);
		this.maxMeta = maxMeta;
		icons = new IIcon[maxMeta+1][6];
	}
	protected MetaBlockWithMultiTexture(String unlocalizedName,float Hardness
			, float Resistance, float LightLevel
			, String HarvestTool, int HarvestLevel
			, Material material,CreativeTabs CreativeTabs,int maxMeta) {
		super(material);
		this.setBlockName(unlocalizedName);
		this.setBlockTextureName(Main.MODID + ":" + unlocalizedName);
		this.setCreativeTab(CreativeTabs);
		this.setHardness(Hardness);
		this.setResistance(Resistance);
		this.setLightLevel(LightLevel);
		this.setHarvestLevel(HarvestTool, HarvestLevel);
		this.maxMeta = maxMeta;
		icons = new IIcon[maxMeta+1][6];
	}
	
	@Override
	public void registerBlockIcons(IIconRegister reg) {
		for (int i = 0; i <= maxMeta; i ++) {
			for (int j=0;j<6;j++) {
				this.icons[i][j] = reg.registerIcon(this.textureName + "_m" + i + "_s" + j);
			}
		}
	}
	//asdfBlock_m2_s5
	//5th side of asdfBlock with meta data 2

	@Override
	public IIcon getIcon(int side, int meta) {
		if(meta > this.maxMeta) {
			meta = 0;
		}
		return this.icons[meta][side];
	}

	@Override
	public int damageDropped(int meta) {
		return meta;
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void getSubBlocks(Item item, CreativeTabs tab, List list) {
	    for (int i = 0; i <=maxMeta; i ++) {
	        list.add(new ItemStack(item, 1, i));
	    }
	}
}
