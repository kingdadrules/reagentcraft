package items;


import main.reagentcraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class ModPIckaxe extends ItemPickaxe {

	private String name;
	public ModPIckaxe(ToolMaterial material, String name) {
	    super(material);
	    setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
	}
	public void registerItemModel(Item item) {
		reagentcraft.proxy.registerItemRenderer(this, 0, name);
	}
	@Override
	public ModPIckaxe setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}