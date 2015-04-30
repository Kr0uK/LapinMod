package com.kr0uk.lapinmod;

/**
 * Created by Kr0uK on 30/04/2015.
 */


import net.minecraft.block.Block;
import net.minecraft.client.gui.inventory.CreativeCrafting;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import com.kr0uk.lapinmod.




@Mod(modid = lapinmod.MODID, version = lapinmod.VERSION)
public class lapinmod {

    public static final String MODID = "lapinmod";
    public static final String VERSION = "1.0";

    public static CreativeTabs lapinTab = new CreativeTabs("LapinMod")
    {
        @Override
        public Item getTabIconItem() {
            return Items.quartz;
        }
    };

    public static Block rabbitfurnace;

    @EventHandler
    public void init(FMLPreInitializationEvent event)
    {
        ;







        }






}
