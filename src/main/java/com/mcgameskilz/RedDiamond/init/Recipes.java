package com.mcgameskilz.RedDiamond.init;


import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes
{
    public static void init()
    {
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.redDiamondBlock), new Object[]
        {
                "XXX", "XXX", "XXX",
                'X', ModItems.redDiamond
        });

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.redDiamond,9), new ItemStack(ModBlocks.redDiamondBlock));

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.hardMetalBlock), new Object[]
        {
                "XXX", "XXX", "XXX", 'X', ModItems.metalPlate
        });

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.uraniumBlock), new Object[]
        {
                "XXX", "XXX", "XXX", 'X', ModItems.uranium
        });

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.rubyBlock), new Object[]
        {
                "XXX", "XXX", "XXX", 'X', ModItems.rubyGem
        });

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.rubyGem, 9), new ItemStack(ModBlocks.rubyBlock));

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.sapphireBlock), new Object[]
        {
                "XXX", "XXX", "XXX", 'X', ModItems.sapphireGem
        });

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.sapphireGem, 9), new ItemStack(ModBlocks.sapphireBlock));

        GameRegistry.addSmelting(ModBlocks.sapphireOreBlock, new ItemStack(ModItems.sapphireGem), 0.5f);
        GameRegistry.addSmelting(ModBlocks.rubyOreBlock, new ItemStack(ModItems.rubyGem), 0.5f);
        GameRegistry.addSmelting(Items.diamond, new ItemStack(ModItems.redDiamond), 0.1f);

        
    }
}
