package main;

import net.minecraftforge.fml.common.registry.GameRegistry;
import worldgen.OreGen;

public class InitOreGen {
	public static void init(){
		GameRegistry.registerWorldGenerator(new OreGen(), 0);
	}
}