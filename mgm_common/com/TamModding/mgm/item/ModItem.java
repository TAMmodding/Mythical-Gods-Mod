package com.TamModding.mgm.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class ModItem extends ItemsBase {

	public ModItem(int par1) {
		super(par1);
		
	}
	
		@SideOnly(Side.CLIENT)
	    public boolean isFull3D()
	    {
	        return false;
	    }

}
