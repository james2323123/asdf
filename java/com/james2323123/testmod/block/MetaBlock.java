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

public class MetaBlock extends Block {
	private int maxMeta;
	public IIcon[] icons;
	protected MetaBlock(String unlocalizedName,float Hardness
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
		this.icons = new IIcon[maxMeta+1];
	}
	protected MetaBlock(String unlocalizedName,float Hardness
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
		this.icons = new IIcon[maxMeta+1];
	}

	@Override
	public void registerBlockIcons(IIconRegister reg) {
		for (int i = 0; i <= maxMeta; i ++) {
			this.icons[i] = reg.registerIcon(this.textureName + "_m" + i);
		}
	}

	@Override
	public IIcon getIcon(int side, int meta) {
		if(meta > this.maxMeta) {
			meta = 0;
		}
		return this.icons[meta];
	}

	@Override
	public int damageDropped(int meta) {
		return meta;
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void getSubBlocks(Item item, CreativeTabs tab, List list) {
		for (int i = 0; i < 6; i ++) {
			list.add(new ItemStack(item, 1, i));
		}
	}

}
