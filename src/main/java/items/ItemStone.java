package items;

import main.reagentcraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemStone extends Item {

	protected String name;

	public ItemStone(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		this.maxStackSize = 1;
		this.setContainerItem(this);
		
	}
	
	public void registerItemModel() {
		reagentcraft.proxy.registerItemRenderer(this, 0, name);
	}
	
	@Override
	public ItemStone setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}