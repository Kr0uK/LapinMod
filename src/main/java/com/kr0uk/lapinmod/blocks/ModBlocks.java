package com.kr0uk.lapinmod.blocks;

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
import com.kr0uk.lapinmod.lapinmod;


public class ModBlocks {

    public static Block rabbitfurnace;
    public static Block rabbitgrinder;






    public class rabbitfurnace extends Block {

        public rabbitfurnace() {

            super(Material.ground);
            setBlockName(lapinmod.MODID + "_" + "Rabbit Furnace");
        }
    }

    public class rabbitgrinder extends Block {

        public rabbitgrinder() {
            super(Material.ground);
            setBlockName(lapinmod.MODID + "_" + "Rabbit Grinder");
        }
    }





  }
        public void init(){

            rabbitfurnace = new rabbitfurnace();

            rabbitgrinder = new rabbitgrinder();

            GameRegistry.registerBlock(rabbitfurnace, "Rabbit Furnace");
            GameRegistry.registerBlock(rabbitgrinder, "Rabbit Grinder");


        }



    }

