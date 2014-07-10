package com.mcgameskilz.RedDiamond.handler;


import com.mcgameskilz.RedDiamond.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {

    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile) {

        if (configuration == null) {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }

    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
            configuration.load();
         }
    }

    private static void loadConfiguration() {
        testValue = configuration.getBoolean("configValue", configuration.CATEGORY_GENERAL, false, "Test Config");

        if (configuration.hasChanged()){
            configuration.save();
        }
    }

}