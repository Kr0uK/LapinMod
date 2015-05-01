package com.kr0uk.lapinmod.init;

/**
 * Created by icfai on 01/05/2015.
 */

import com.kr0uk.lapinmod.items.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
public class ItemInit {

    public static final ModItems carrotblend  = new ModItems();

    public static void init(){

        GameRegistry.registerItem(ModItems.carrotblend);
    }
}
