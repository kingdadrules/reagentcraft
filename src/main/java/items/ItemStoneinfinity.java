package items;

import main.reagentcraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemStoneinfinity extends Item {
	
	protected String name;
	
	public ItemStoneinfinity(String name) {	
		
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		this.maxStackSize = 1;
		this.setNoRepair();
		this.setMaxDamage(200);
		this.hasContainerItem();
		this.setContainerItem(this);
		this.doesContainerItemLeaveCraftingGrid(false);
		
		}
	
	public void registerItemModel() {
		reagentcraft.proxy.registerItemRenderer(this, 0, name);
	}
	
	@Override
	public ItemStoneinfinity setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

	
	@Override
	public boolean hasContainerItem()
	{
		 return true;
	}
	
    public boolean doesContainerItemLeaveCraftingGrid(boolean b)
    
    {
        return false;
    }

    @Override
	public ItemStack getContainerItem(ItemStack itemStack)
	{
	// copy our item.
	ItemStack returnItem = new ItemStack(itemStack.getItem(), 1, itemStack.getItemDamage()+1);		
	
	return returnItem;
	}			

}