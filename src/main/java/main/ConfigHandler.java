package main;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {

	public static Configuration config;

    // Settings
public static boolean enableRedstoneSmelting;
public static boolean enableInfinityCrafting;
public static boolean nonDiamondCraftingStone;
public static boolean enableArmor;
public static boolean enableTools;
public static boolean enableSword;


public static void init(File file) {
    config = new Configuration(file);
    syncConfig();
}
public static void syncConfig() {
    String category;

    category = "Smelting";
    config.addCustomCategoryComment(category, "Smelting settings");
    
    enableRedstoneSmelting = config.getBoolean("enableRedstoneSmelting", category, true, "Allows smelting of 1 redstone dust into 1 reagent nugget.");
    
    category = "Crafting";
    config.addCustomCategoryComment(category, "Crafting settings");
    enableInfinityCrafting = config.getBoolean("enableInfinityCrafting", category, true, "Allows crafting of Stone of Infinity.");
    nonDiamondCraftingStone = config.getBoolean("nonDiamondCraftingStone", category, true, "Alternate Crafting Stone recipe without diamonds.");
    
    category = "Armor";
    config.addCustomCategoryComment(category, "Armor settings");
    enableArmor = config.getBoolean("enableArmor", category, true, "Enables reagentcraft armor set.");
    
    category = "Tools";
    config.addCustomCategoryComment(category, "Tool settings");
    enableTools = config.getBoolean("enableTools", category, true, "Enables reagentcraft armor set.");
    
    category = "Sword";
    config.addCustomCategoryComment(category, "Sword settings");
    enableSword = config.getBoolean("enableSword", category, true, "Enables reagentcraft sword.");
    
    config.save();
	}
}