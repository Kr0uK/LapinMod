package com.kr0uk.lapinmod;

/**
 * Created by Kr0uK on 30/04/2015.
 */


import com.kr0uk.lapinmod.items.ModItems;
import com.kr0uk.lapinmod.proxy.IProxy;
import com.kr0uk.lapinmod.recipes.ModRecipes;
import com.kr0uk.lapinmod.tileentities.ModTileEntities;
import cpw.mods.fml.common.SidedProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import com.kr0uk.lapinmod.blocks.ModBlocks;


@Mod(modid = lapinmod.MODID, version = lapinmod.VERSION)



public class lapinmod {

    @Mod.Instance("lapinmod")
    public static lapinmod instance;

    @SidedProxy(clientSide = "com.kr0uk.lapinmod.proxy.ClientProxy", serverSide = "com.kr0uk.lapinmod.proxy.ServerProxy")
    public static IProxy proxy;

    public static final String MODID = "lapinmod";
    public static final String VERSION = "1.0";


    public static CreativeTabs lapinTab = new CreativeTabs("LapinMod")
    {
        @Override
        public Item getTabIconItem() {
            return Items.quartz;
        }
    };



    @EventHandler
    public void init(FMLPreInitializationEvent event)
    {

        ModBlocks.init();
        ModItems.init();
        ModTileEntities.init();
        ModRecipes.init();

    }

    public void init(FMLInitializationEvent event) {
    }

    public void init(FMLPostInitializationEvent event) {
    }
    }






}
