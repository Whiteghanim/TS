package com.TS.Itemx;

import com.TS.mainPackage.mainClass;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class itemtainquartz extends Item {

	public itemtainquartz(int par1) {
		super(par1);
		this.setUnlocalizedName("itemtainquartz");
		this.setCreativeTab(mainClass.TSTab);
		this.setMaxStackSize(64);
	}
	public void registerIcons(IconRegister IR) {
		itemIcon = IR.registerIcon("Testing:darkQuartz");
	}
}