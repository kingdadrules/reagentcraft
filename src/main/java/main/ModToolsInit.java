package main;


import items.ModPIckaxe;
import items.ModSpade;
import items.ModHoe;
import items.ModAxe;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.registries.IForgeRegistry;

public class ModToolsInit {
					// harvestLevel, durability, miningSpeed, damageVsEntities, enchantability
	
	public static ToolMaterial toolMaterial = EnumHelper.addToolMaterial("toolMaterial", 3, 9000, 15, 4, 30);
	public static ToolMaterial axeMaterial = EnumHelper.addToolMaterial("axeMaterial", 3, 4000, 15, 8, 30);
			
	public static ModPIckaxe modpickaxe = new ModPIckaxe(toolMaterial, "modpickaxe").setCreativeTab(CreativeTab.reagent);
	public static ModAxe modaxe = new ModAxe(axeMaterial, "modaxe").setCreativeTab(CreativeTab.reagent);
	public static ModSpade modspade = new ModSpade(toolMaterial, "modspade").setCreativeTab(CreativeTab.reagent);
	public static ModHoe modhoe = new ModHoe(toolMaterial, "modhoe").setCreativeTab(CreativeTab.reagent);
	
	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(
								
		
		modpickaxe,
		modaxe,
		modspade,
		modhoe		
				
		);
	}

	public static void registerModels() {		
		
		modpickaxe.registerItemModel(modpickaxe);
		modaxe.registerItemModel(modaxe);
		modspade.registerItemModel(modspade);
		modhoe.registerItemModel(modhoe);
		
	}
}