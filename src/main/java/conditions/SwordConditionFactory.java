package conditions;

import java.util.function.BooleanSupplier;

import com.google.gson.JsonObject;

import main.ConfigHandler;
import net.minecraftforge.common.crafting.IConditionFactory;
import net.minecraftforge.common.crafting.JsonContext;

public class SwordConditionFactory implements IConditionFactory {
	
	public BooleanSupplier parse(JsonContext context, JsonObject json) 
	{		
			return () -> ConfigHandler.enableTools;	
	}		

}