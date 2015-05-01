package com.kr0uk.lapinmod.proxy;

/**
 * Created by icfai on 30/04/2015.
 */

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerRender()
    {
        System.out.println("méthode côté client");
    }
}

