package com.mcgameskilz.RedDiamond.block;


import net.minecraft.block.material.Material;

public class BlockDiamondBrick extends BlockRDM
{
    public BlockDiamondBrick()
    {
        super(Material.iron);
        this.setBlockName("diamondBrickBlock");
        this.setHarvestLevel("pickaxe", 2);
    }
}
