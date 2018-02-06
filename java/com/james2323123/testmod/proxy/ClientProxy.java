package com.james2323123.testmod.proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{
	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
		System.out.println("Client PreInit...");
    }
	@Override
    public void init(FMLInitializationEvent e) {
		super.init(e);
		System.out.println("Client Init...");
    }
	@Override
    public void postInit(FMLPostInitializationEvent e) {
		super.postInit(e);
		System.out.println("Client PostInit...");
    }
}