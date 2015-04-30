package com.kr0uk.lapinmod;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import com.kr0uk.lapinmod.




public class Recipes {

    public static void init() {

        GameRegistry.addRecipe(new ItemStack(com.kr0uk.lapinmod.Blocks.rabbitfurnace), new Object[]
                {
                        "AAA",
                        "ABA",
                        "AAA",
                        'A', net.minecraft.init.Blocks.cobblestone, 'B', Items.carrot
                });

    }
}
