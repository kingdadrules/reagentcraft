package main;

import java.io.File;

import org.apache.logging.log4j.Logger;

import proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = reagentcraft.modId, name = reagentcraft.name, version = reagentcraft.version, acceptedMinecraftVersions = "[1.12]")
public class reagentcraft {

	public static final ItemArmor.ArmorMaterial reagentAmorMaterial = EnumHelper.addArmorMaterial("MODARMOR",
			main.reagentcraft.modId + ":modarmor", 60, new int[] { 3, 6, 8, 3 },30, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	private static File configDir;

    public static File getConfigDir() {
        return configDir;  
    }
	
	@SidedProxy(serverSide = "proxy.CommonProxy", clientSide = "proxy.ClientProxy")
	public static CommonProxy proxy;

	@Mod.EventBusSubscriber
	public static class RegistrationHandler {

		@SubscribeEvent
		public static void registerBlocks(RegistryEvent.Register<Block> event) {
			ModBlocksInit.register(event.getRegistry());
		}

		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			if (ConfigHandler.enableTools) {
				ModToolsInit.register(event.getRegistry());
			}
			if (ConfigHandler.enableArmor) {
				ModArmorInit.register(event.getRegistry());
			}
			if (ConfigHandler.enableSword) {
				ModSwordInit.register(event.getRegistry());
			}
			ModItemsInit.register(event.getRegistry());
			ModBlocksInit.registerItemBlocks(event.getRegistry());
		}

		@SubscribeEvent
		public static void registerModels(ModelRegistryEvent event) {
			if (ConfigHandler.enableTools) {
				ModToolsInit.registerModels();
			}
			if (ConfigHandler.enableArmor) {
				ModArmorInit.registerModels();
			}
			if (ConfigHandler.enableSword) {
				ModSwordInit.registerModels();
			}
			ModBlocksInit.registerModels();
			ModItemsInit.registerModels();
		}

	}

	public static final String modId = "reagentcraft";
	public static final String name = "reagentcraft";
	public static final String version = "MC.1.12-1.0.0";
	public static Logger logger;

	@Mod.Instance(modId)
	public static reagentcraft instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();	
		
		//configDir = new File(event.getModConfigurationDirectory() + "/" + reagent.modId);
		configDir = new File(event.getModConfigurationDirectory() + "/" );
        //configDir.mkdirs();
        ConfigHandler.init(new File(configDir.getPath(), reagentcraft.modId + ".cfg"));        
	}
	
	

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		ModRecipes.init();
		InitOreGen.init();

	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}

}