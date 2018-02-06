package com.james2323123.testmod.item;

import com.james2323123.testmod.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public final class ModItem {

    public static Item asdf;
    public static Item meta;
    public static Item asdSword;
    public static Item asdMattock;
    public static Item asdHelmet;
    public static Item asdChestplate;
    public static Item asdLeggings;
    public static Item asdBoots;
    public static ToolMaterial ASD = EnumHelper.addToolMaterial("ASD", 2, 1234, 16.0F, 1000.0F, 50);
    public static ArmorMaterial ASD_ARMOR = EnumHelper.addArmorMaterial("ASD", 100, new int[] {3,5,4,2}, 40);
    public static final void init() {
        asdf = new Item().setUnlocalizedName("asdf").setCreativeTab(CreativeTabs.tabMisc).setTextureName(Main.MODID + ":asdf");
        GameRegistry.registerItem(asdf, "asdf");
        meta = new MetaItem("meta", 5, CreativeTabs.tabMaterials);
        GameRegistry.registerItem(meta, "meta");
        asdSword = new ModSword("asdSword", ASD);
        GameRegistry.registerItem(asdSword, "asd_sword");
        asdMattock = new ItemMattock("asdMattock", ASD);
        GameRegistry.registerItem(asdMattock, "asd Mattock");
        asdHelmet = new ItemModArmor("asdHelmet", ASD_ARMOR, "asdArmor", 0);
        asdChestplate = new ItemModArmor("asdChestplate", ASD_ARMOR, "asdArmor", 1);
        asdLeggings = new ItemModArmor("asdLeggings", ASD_ARMOR, "asdArmor", 2);
        asdBoots = new ItemModArmor("asdBoots", ASD_ARMOR, "asdArmor", 3);
        GameRegistry.registerItem(asdHelmet, "asdHelmet");
        GameRegistry.registerItem(asdChestplate, "asdChestplate");
        GameRegistry.registerItem(asdLeggings, "asdLeggings");
        GameRegistry.registerItem(asdBoots, "asdBoots");
    }

}