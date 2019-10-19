package items;

import main.reagentcraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemStonecrafting extends Item {

	protected String name;

	public ItemStonecrafting(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		this.maxStackSize = 64;
		
	}
	
	public void registerItemModel() {
		reagentcraft.proxy.registerItemRenderer(this, 0, name);
	}
	
	@Override
	public ItemStonecrafting setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}