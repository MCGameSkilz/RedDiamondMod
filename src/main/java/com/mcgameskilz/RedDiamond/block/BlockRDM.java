package com.mcgameskilz.RedDiamond.block;


import com.mcgameskilz.RedDiamond.creativetab.CreativeTabRDM;
import com.mcgameskilz.RedDiamond.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockRDM extends Block {
    public BlockRDM(Material material) {
        super(material);
        this.setCreativeTab(CreativeTabRDM.RDM_TAB);
        this.setHardness(3);
    }

    public BlockRDM() {
        this(Material.iron);
        this.setCreativeTab(CreativeTabRDM.RDM_TAB);
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
