package com.mcgameskilz.RedDiamond.block;


import net.minecraft.block.material.Material;

public class BlockPoopHardened extends BlockRDM {
    public BlockPoopHardened() {
        super(Material.rock);
        this.setBlockName("hardenedPoopBlock");
        this.setHardness(5);
        this.setHarvestLevel("pickaxe", 1);
    }
}
