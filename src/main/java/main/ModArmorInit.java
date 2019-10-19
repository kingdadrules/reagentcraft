package main;

import items.ModArmor;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.registries.IForgeRegistry;

public class ModArmorInit {
					// harvestLevel, durability, miningSpeed, damageVsEntities, enchantability
		
	public static ToolMaterial BakedMaterial = EnumHelper.addToolMaterial("BakedMaterial", 2, 99, 3, (float) 0.9, 10);
		
	public static ModArmor modboots = new ModArmor(reagentcraft.reagentAmorMaterial, EntityEquipmentSlot.FEET, "modboots").setCreativeTab(CreativeTab.reagent);
	public static ModArmor modleggings = new ModArmor(reagentcraft.reagentAmorMaterial, EntityEquipmentSlot.LEGS, "modleggings").setCreativeTab(CreativeTab.reagent);
	public static ModArmor modchestplate = new ModArmor(reagentcraft.reagentAmorMaterial, EntityEquipmentSlot.CHEST, "modchestplate").setCreativeTab(CreativeTab.reagent);
	public static ModArmor modhelmet = new ModArmor(reagentcraft.reagentAmorMaterial, EntityEquipmentSlot.HEAD, "modhelmet").setCreativeTab(CreativeTab.reagent);
	
	
	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(
		
		modboots,
		modleggings,
		modchestplate,
		modhelmet		
				
		);
	}

	public static void registerModels() {			
		
		modboots.registerItemModel(modboots);
		modleggings.registerItemModel(modleggings);
		modchestplate.registerItemModel(modchestplate);
		modhelmet.registerItemModel(modhelmet);
		
		
		
	}
}