package com.mcgameskilz.RedDiamond.init;


import com.mcgameskilz.RedDiamond.item.ItemRedDiamond;
import com.mcgameskilz.RedDiamond.item.ItemRedDiamondMod;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
    public static final ItemRedDiamondMod redDiamond = new ItemRedDiamond();

    public static void init() {
        GameRegistry.registerItem(redDiamond, "RedDiamond");
    }
}
