package com.kr0uk.lapinmod;

/**
 * Created by icfai on 30/04/2015.
 */

import cpw.mods.fml.client.registry.RenderingRegistry;

public class CommonProxy
{
    public void registerRender()
    {
        System.out.println("méthode côté serveur");
    }
}
