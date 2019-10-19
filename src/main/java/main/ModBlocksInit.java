package main;

import blocks.BlockOre;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
public class ModBlocksInit {
	
	public static BlockOre reagentore = new BlockOre("reagentore").setCreativeTab(CreativeTab.reagent);

	
	public static void register(IForgeRegistry<Block> registry) {
		registry.registerAll(			
				reagentore				
		);
	}
	
	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		registry.registerAll(
			
				reagentore.createItemBlock()
		
		);
	}
	
	public static void registerModels() {
		
		reagentore.registerItemModel(Item.getItemFromBlock(reagentore));
		
	}
		
} 