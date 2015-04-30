package com.kr0uk.lapinmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;


public class Blocks {


    rabbitfurnace=new Block();

    rabbitfurnace();

    GameRegistry.registerBlock(rabbitfurnace,"RabbitFurnace");


    public class rabbitfurnace extends Block {

        public rabbitfurnace() {
            super(Material.rock);
            setBlockName(lapinmod.MODID + "_" + "Rabbit Furnace");
            setCreativeTab(CreativeTabs.tabBlock);
        }
    }
}
