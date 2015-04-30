package com.kr0uk.lapinmod;

/**
 * Created by Kr0uK on 30/04/2015.
 */


import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = lapinmod.MODID, version = lapinmod.VERSION)
public class lapinmod {

    public static final String MODID = "lapinmod";
    public static final String VERSION = "1.0";

    public static Block rabbitfurnace;

    @EventHandler
    public void init(FMLPreInitializationEvent event)
    {
        rabbitfurnace = new rabbitfurnace();

        GameRegistry.registerBlock(rabbitfurnace, "Rabbit Furnace");



        }






}
