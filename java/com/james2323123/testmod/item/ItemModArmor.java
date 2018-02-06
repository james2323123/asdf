package com.james2323123.testmod.item;

import com.james2323123.testmod.Main;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemModArmor extends ItemArmor {
	
	public String wornTextureName;
	public ItemModArmor(String unlocalizedName, ArmorMaterial material, String wornTextureName, int type) {
		super(material, 0, type);
		this.wornTextureName = wornTextureName;
		 this.setUnlocalizedName(unlocalizedName);
		 this.setTextureName(Main.MODID + ":" + unlocalizedName);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
	    return Main.MODID + ":textures/armor/" + this.wornTextureName + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}
	
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if (player.getCurrentArmor(1) != null && player.getCurrentArmor(1).getItem().equals(ModItem.asdLeggings))
		    player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 40));
		}
}
