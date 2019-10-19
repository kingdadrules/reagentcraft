package main;

import items.ModSword;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.registries.IForgeRegistry;

public class ModSwordInit {
					// harvestLevel, durability, miningSpeed, damageVsEntities, enchantability
		
	public static ToolMaterial swordMaterial = EnumHelper.addToolMaterial("swordMaterial", 3, 4000, 15, 14, 30);
		
	public static ModSword modsword = new ModSword(swordMaterial, "modsword").setCreativeTab(CreativeTab.reagent);
		
	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(
								
		modsword
				
		);
	}

	public static void registerModels() {		
		
		modsword.registerItemModel(modsword);
				
	}
}