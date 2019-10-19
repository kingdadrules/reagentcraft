package main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTab {
	
	public static final CreativeTabs reagent = new CreativeTabs("reagentcraft") {
		@Override 
		public ItemStack getTabIconItem() {
		    return new ItemStack(ModItemsInit.alstone);
		}
		
	};

}