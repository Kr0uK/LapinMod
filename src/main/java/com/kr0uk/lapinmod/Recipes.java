package com.kr0uk.lapinmod;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by icfai on 30/04/2015.
 */
public class Recipes {

    rabbitfurnace = new rabbitfurnace();

    GameRegistry.registerBlock(rabbitfurnace, "Rabbit Furnace");

    GameRegistry.addRecipe(new ItemStack(rabbitfurnace), new Object[]
    {
        "AAA",
                "ABA",
                "AAA",
                'A', net.minecraft.init.Blocks.cobblestone, 'B', Items.carrot
    });
}
