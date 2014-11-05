package com.mcgameskilz.RedDiamond.creativetab;


import com.mcgameskilz.RedDiamond.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabItems
{
    public static final CreativeTabs Items_TAB = new CreativeTabs("Mr. Creative's Mod: Items")
    {
        @Override
        public Item getTabIconItem() {
            return ModItems.rubyGem;
        }
    };
}
