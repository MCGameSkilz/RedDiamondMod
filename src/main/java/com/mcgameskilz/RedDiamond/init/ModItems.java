package com.mcgameskilz.RedDiamond.init;


import com.mcgameskilz.RedDiamond.item.*;
import com.mcgameskilz.RedDiamond.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemRedDiamondMod redDiamond = new ItemRedDiamond();
    public static final ItemRedDiamondMod mrCreativesModIcon = new ItemMrCreativesModIcon();
    public static final ItemRedDiamondMod roadCreativeTabIcon = new ItemRoadCreativeTabIcon();
    public static final ItemRedDiamondMod mrCreativesModIcon2 = new ItemMrCreativesModIconReal();
    public static final ItemRedDiamondMod uranium = new ItemUranium();
    public static final ItemRedDiamondMod metalPlate = new ItemMetalPlate();
    public static final ItemRedDiamondMod rubyGem = new ItemRubyGem();
    public static final ItemRedDiamondMod sapphireGem = new ItemSapphireGem();

    public static void init()
    {
        GameRegistry.registerItem(redDiamond, "redDiamond");
        GameRegistry.registerItem(mrCreativesModIcon, "mrCreativesModIcon");
        GameRegistry.registerItem(roadCreativeTabIcon, "roadCreativeTabIcon");
        GameRegistry.registerItem(mrCreativesModIcon2, "mrCreativesModIcon2");
        GameRegistry.registerItem(uranium, "uranium");
        GameRegistry.registerItem(metalPlate, "metalPlate");
        GameRegistry.registerItem(rubyGem, "rubyGem");
        GameRegistry.registerItem(sapphireGem, "sapphireGem");

    }
}