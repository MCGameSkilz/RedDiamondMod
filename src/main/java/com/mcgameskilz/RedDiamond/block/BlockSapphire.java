package com.mcgameskilz.RedDiamond.block;


import net.minecraft.block.material.Material;

public class BlockSapphire extends BlockRDM {
    public BlockSapphire() {
        super(Material.iron);
        this.setBlockName("sapphireBlock");
        this.setHarvestLevel("pickaxe", 2);
    }
}
