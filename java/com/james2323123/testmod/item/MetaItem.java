package com.james2323123.testmod.item;

import java.util.List;

import com.james2323123.testmod.Main;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class MetaItem extends Item {
	public int maxMeta;
	public IIcon[] icon;
	public String textureName;
	public MetaItem(String unlocalizedName,int maxMeta, CreativeTabs creativeTabs) {
        super();
        this.setHasSubtypes(true);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(creativeTabs);
        this.maxMeta = maxMeta;
        this.textureName = unlocalizedName;
        icon = new IIcon[maxMeta+1];
	}
	
	@Override
	public void registerIcons(IIconRegister reg) {
	    for (int i = 0; i <= this.maxMeta; i ++) {
	        this.icon[i] = reg.registerIcon(Main.MODID + ":" + this.textureName + "_" + i);
	    }
	}
	
	@Override
	public IIcon getIconFromDamage(int meta) {
	    if (meta > maxMeta)
	        meta = 0;

	    return this.icon[meta];
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list) {
	    for (int i = 0; i <= maxMeta; i ++) {
	        list.add(new ItemStack(item, 1, i));
	    }
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
	    return this.getUnlocalizedName() + "_" + stack.getItemDamage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
