package items;

import main.reagentcraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;

public class ModArmor extends net.minecraft.item.ItemArmor {
	
	private String name;

	public ModArmor(ArmorMaterial material, EntityEquipmentSlot slot, String name) {
		super(material, 0, slot);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
	}
	
	public void registerItemModel(Item item) {
		reagentcraft.proxy.registerItemRenderer(this, 0, name);
	}
	
	@Override
	public ModArmor setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}