
package items;

import main.reagentcraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemAlstone extends Item {

	protected String name;

	public ItemAlstone(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		this.maxStackSize = 64;
		this.setContainerItem(this);
		
	}
	
	public void registerItemModel() {
		reagentcraft.proxy.registerItemRenderer(this, 0, name);
	}
	
	@Override
	public ItemAlstone setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}