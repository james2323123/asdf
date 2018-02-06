package com.james2323123.testmod.item;

import java.util.ArrayList;

import com.james2323123.testmod.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ModFood extends ItemFood {

	private ArrayList<ProbPotionEffect> probEffects = new ArrayList<ProbPotionEffect>();
	private PotionEffect[] certainEffect;
	public ModFood(String unlocalizedName ,int healAmount, float saturationModifier, boolean wolvesFavorite,PotionEffect... effects ) {
		super(healAmount, saturationModifier, wolvesFavorite);
		this.setUnlocalizedName(unlocalizedName);
	    this.setTextureName(Main.MODID + ":" + unlocalizedName);
	    this.setCreativeTab(CreativeTabs.tabFood);
	    this.certainEffect = effects;
	}
	
	public ModFood addPotionEffect(PotionEffect e ,float prob) {
		probEffects.add(new ProbPotionEffect(prob,e));
		return this;
	}
	public ModFood addPotionEffect(int potionID ,int duration ,int amplifier ,float prob) {
		PotionEffect e = new PotionEffect(potionID, duration, amplifier);
		addPotionEffect(e ,prob);
		return this;
	}
	
	
	@Override
	public void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
		super.onFoodEaten(stack, world, player);
		for (int i=0; i<certainEffect.length; i++ ) {
			 if (!world.isRemote && certainEffect[i] != null && certainEffect[i].getPotionID() > 0) {
				 	player.addPotionEffect(certainEffect[i]);
		        }
		}
		for (int i=0; i < probEffects.size(); i ++) {
	        if (!world.isRemote && probEffects.get(i) != null && probEffects.get(i).getPotionID() > 0) {
	        	probEffects.get(i).applyEffect(world, player);
	        }
	    }
	}

}
