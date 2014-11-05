package com.mcgameskilz.RedDiamond.block;


import net.minecraft.block.material.Material;

public class BlockSapphireOre extends BlockRDM {
    public BlockSapphireOre() {
        super(Material.rock);
        this.setBlockName("sapphireOreBlock");
        this.setHarvestLevel("pickaxe", 2);
    }
}
