package com.kr0uk.lapinmod.proxy;

/**
 * Created by icfai on 30/04/2015.
 */

import cpw.mods.fml.client.registry.RenderingRegistry;

public abstract class CommonProxy implements IProxy
{
    public void registerRender()
    {
        System.out.println("méthode côté serveur");
    }
}
