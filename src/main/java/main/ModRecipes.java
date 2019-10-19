package main;

import main.ConfigHandler;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init() {
	
	// Smelting
	
	GameRegistry.addSmelting(new ItemStack(ModBlocksInit.reagentore), new ItemStack(ModItemsInit.reagentingot, 1), 0.5F);
	
	if (ConfigHandler.enableRedstoneSmelting) {
	GameRegistry.addSmelting(new ItemStack(Items.REDSTONE), new ItemStack(ModItemsInit.reagentnugget, 1), 0.5F);
	}	
	
	

		}

	}