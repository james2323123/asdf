package com.james2323123.testmod.block;

import com.james2323123.testmod.item.ItemBlockMetaBlock;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;


public class ModBlock {
	
	public static Block asdfBlock;
	public static Block qwerBlock;
	public static Block zxcvBlock;
	public static Block metaBlock;
	public static Block metaBlockX;
	//String unlocalizedName,float Hardness
	// , float Resistance, float LightLevel
	// , String HarvestTool, int HarvestLevel
	// , Material material,SoundType SoundType,CreativeTabs CreativeTabs
	
	//Hardness sets how long it takes to break the block. stone:1.5F; obsidian:50.0F
	//Resistance sets the block's resistance against explosions. stone:10.0F; obsidian:2000.0F

    public static final void init() {
    	asdfBlock = new BasicBlock("asdfBlock", 2.0F, 6.0F, 1.0F, "pickaxe", 3, Material.iron,
   			 net.minecraft.block.Block.soundTypeGlass, CreativeTabs.tabBlock);
    	GameRegistry.registerBlock(asdfBlock, "asdfBlock");
    	qwerBlock = new BasicBlock("qwerBlock",1.0F,6.0F,1.0F,"pickaxe",2,Material.sand,net.minecraft.block.Block.soundTypeSand, CreativeTabs.tabBlock);
    	GameRegistry.registerBlock(qwerBlock, "qwerBlock");
    	zxcvBlock = new MultiTextureBlock("zxcvBlock", 4.0F, 123.0F, 1.0F, "shovel", 1, Material.cloth, CreativeTabs.tabBlock);
    	GameRegistry.registerBlock(zxcvBlock, "zxcvBlock");
    	metaBlock = new MetaBlock("metaBlock", 1.0F, 1.0F, 1.0F, "pickaxe", 0, Material.wood, CreativeTabs.tabBlock, 5);
    	GameRegistry.registerBlock(metaBlock, ItemBlockMetaBlock.class,"metaBlock");
    	metaBlockX = new MetaBlockWithMultiTexture("metaBlockX", 1.0F, 13.0F, 0.0F, "axe", 1, Material.clay, CreativeTabs.tabBlock, 1);
    	GameRegistry.registerBlock(metaBlockX,  ItemBlockMetaBlock.class, "metaBlockX");
    }
}
