package com.kr0uk.lapinmod.configuration;

import javax.security.auth.login.AppConfigurationEntry;

import com.kr0uk.lapinmod.reference.reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import java.io.File;


/**
 * Created by icfai on 01/05/2015.
 */
public class ConfigHandler {

    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile)
    {
        // Create the configuration object from the given configuration file
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example configuration value");

        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(reference.ModId))
        {
            loadConfiguration();
        }
    }

    }

