package com.kr0uk.lapinmod;

/**
 * Created by icfai on 30/04/2015.
 */

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
public class TileEntities {

public class rabbitfurnace extends TileEntity {

    public rabbitfurnace()
    {
        super(Material.rock);
        setBlockName(lapinmod.MODID + "_" + "Rabbit Furnace");
        setCreativeTab(CreativeTabs.tabBlock);
    }


}
