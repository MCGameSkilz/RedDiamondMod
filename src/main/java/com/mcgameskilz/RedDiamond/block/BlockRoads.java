package com.mcgameskilz.RedDiamond.block;


import com.mcgameskilz.RedDiamond.creativetab.CreativeTabRoads;
import com.mcgameskilz.RedDiamond.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockRoads extends Block {
    public BlockRoads(Material material) {
        super(material);
        this.setCreativeTab(CreativeTabRoads.Roads_TAB);
        this.setHardness(3);
    }

    public BlockRoads() {
        this(Material.iron);
        this.setCreativeTab(CreativeTabRoads.Roads_TAB);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }



}
