package com.james2323123.testmod.item;

import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ProbPotionEffect {
	private Random rand;
	private float probability;
	private PotionEffect effect;
	
	public ProbPotionEffect(float prob ,PotionEffect e) {
		this.probability = prob;
		this.effect = e;
		this.rand = new Random();
	}
	
	public void applyEffect(World world ,EntityPlayer player) {
		if(!world.isRemote && rand.nextFloat() <= this.probability) {
			player.addPotionEffect(this.effect);
		}
	}
	
	public int getPotionID() {
		return effect.getPotionID();
	}

	
	
	
}
