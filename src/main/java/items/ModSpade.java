package items;

import main.reagentcraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

public class ModSpade extends ItemSpade {

	private String name;
	public ModSpade(ToolMaterial material, String name) {
	    super(material);
	    setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
	}
	public void registerItemModel(Item item) {
		reagentcraft.proxy.registerItemRenderer(this, 0, name);
	}
	@Override
	public ModSpade setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}