package com.mcgameskilz.RedDiamond.block;


import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;

import java.util.Random;

public class BlockSuperGlass extends BlockRDM {
    public BlockSuperGlass() {
        super(Material.glass);
        this.setBlockName("superGlassBlock");

    }

    public boolean isOpaqueCube()
    {
        return false;
    }
    public int quantityDropped(Random p_149745_1_)
    {
        return 0;
    }
    protected boolean canSilkHarvest()
    {
        return true;
    }
}
