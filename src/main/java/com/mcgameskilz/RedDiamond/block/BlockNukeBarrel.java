package com.mcgameskilz.RedDiamond.block;


import com.mcgameskilz.RedDiamond.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockNukeBarrel extends BlockRDM {

    @SideOnly(Side.CLIENT)
    private IIcon top;
    @SideOnly(Side.CLIENT)
    private IIcon front;

    public BlockNukeBarrel() {
        super(Material.iron);
        this.setBlockName("nukeBarrelBlock");
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int p_149691_2_)
    {
        return side == 1 || side == 0 ? this.top : (side == 2 ? this.front : this.blockIcon);
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.blockIcon = p_149651_1_.registerIcon(Reference.MOD_ID + ":" + "nukeBarrelBlockSide");
        this.top = p_149651_1_.registerIcon(Reference.MOD_ID + ":" + "nukeBarrelBlockTop");
        this.front = p_149651_1_.registerIcon(Reference.MOD_ID + ":" + "nukeBarrelBlockSide");
    }
}
