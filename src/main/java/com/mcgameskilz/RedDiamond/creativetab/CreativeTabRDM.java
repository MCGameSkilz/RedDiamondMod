package com.mcgameskilz.RedDiamond.creativetab;


import com.mcgameskilz.RedDiamond.init.ModBlocks;
import com.mcgameskilz.RedDiamond.init.ModItems;
import com.mcgameskilz.RedDiamond.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabRDM
{
    public static final CreativeTabs RDM_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.mrCreativesModIcon2;

        }


    };
}
