package com.kr0uk.lapinmod.init;

/**
 * Created by icfai on 01/05/2015.
 */
import com.kr0uk.lapinmod.items.ItemCarrotBlend;
import com.kr0uk.lapinmod.items.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import com.kr0uk.lapinmod.reference.names;
import com.kr0uk.lapinmod.reference.reference;

@GameRegistry.ObjectHolder(reference.ModId)
public class ItemInit {

    public static final ModItems carrotBlend = new ItemCarrotBlend();

    public static void init()
    {

        GameRegistry.registerItem(carrotBlend, "carrotblend");

    }
}
