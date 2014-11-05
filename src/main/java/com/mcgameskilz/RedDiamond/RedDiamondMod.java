package com.mcgameskilz.RedDiamond;

import com.mcgameskilz.RedDiamond.handler.ConfigurationHandler;
import com.mcgameskilz.RedDiamond.init.ModBlocks;
import com.mcgameskilz.RedDiamond.init.ModItems;
import com.mcgameskilz.RedDiamond.init.Recipes;
import com.mcgameskilz.RedDiamond.proxy.IProxy;
import com.mcgameskilz.RedDiamond.utility.LogHelper;
import com.mcgameskilz.RedDiamond.reference.Reference;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version=Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)

public class RedDiamondMod
{

    @Mod.Instance(Reference.MOD_ID)
    public static RedDiamondMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());

        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        LogHelper.info("Pre Initialization Complete!");


        ModItems.init();

        ModBlocks.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

        Recipes.init();

        LogHelper.info("Initialization Complete!");


    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete!");
    }
}
