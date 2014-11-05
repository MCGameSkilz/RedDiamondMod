package com.mcgameskilz.RedDiamond.block;


import net.minecraft.block.material.Material;

public class BlockRubyOre extends BlockRDM {
    public BlockRubyOre() {
        super(Material.rock);
        this.setBlockName("rubyOreBlock");
        this.setHarvestLevel("pickaxe", 2);
    }
}
