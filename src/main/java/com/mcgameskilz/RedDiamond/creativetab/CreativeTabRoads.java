package com.mcgameskilz.RedDiamond.creativetab;


import com.mcgameskilz.RedDiamond.init.ModItems;
import com.mcgameskilz.RedDiamond.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabRoads
{
    public static final CreativeTabs Roads_TAB = new CreativeTabs("Mr. Creative's Mod: Roads")
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.roadCreativeTabIcon;

        }
    };
}
