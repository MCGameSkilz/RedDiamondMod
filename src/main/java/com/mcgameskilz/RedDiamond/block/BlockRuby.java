package com.mcgameskilz.RedDiamond.block;


import net.minecraft.block.material.Material;

public class BlockRuby extends BlockRDM {
    public BlockRuby() {
        super(Material.iron);
        this.setBlockName("rubyBlock");
        this.setHarvestLevel("pickaxe", 2);
    }
}
