package main;

import items.ItemBase;
import items.ItemStone;
import items.ItemStoneinfinity;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItemsInit {
	
	//Main stones
	public static ItemBase reagent1 = new ItemBase("reagent1").setCreativeTab(CreativeTab.reagent);
	public static ItemBase reagent2 = new ItemBase("reagent2").setCreativeTab(CreativeTab.reagent);
	public static ItemBase reagent3 = new ItemBase("reagent3").setCreativeTab(CreativeTab.reagent);
	public static ItemBase reagent4 = new ItemBase("reagent4").setCreativeTab(CreativeTab.reagent);
	public static ItemBase reagent5 = new ItemBase("reagent5").setCreativeTab(CreativeTab.reagent);
	public static ItemBase reagent6 = new ItemBase("reagent6").setCreativeTab(CreativeTab.reagent);	
	public static ItemBase reagentnugget = new ItemBase("reagentnugget").setCreativeTab(CreativeTab.reagent);
	public static ItemBase reagentingot = new ItemBase("reagentingot").setCreativeTab(CreativeTab.reagent);
	public static ItemBase reagentjewel = new ItemBase("reagentjewel").setCreativeTab(CreativeTab.reagent);
	public static ItemBase alstone = new ItemBase("alstone").setCreativeTab(CreativeTab.reagent);
	public static ItemBase stonecrafting = new ItemBase("stonecrafting").setCreativeTab(CreativeTab.reagent);
	
	//Dye stones
	public static ItemStone stonered = new ItemStone("stonered").setCreativeTab(CreativeTab.reagent);
	public static ItemStone stoneyellow = new ItemStone("stoneyellow").setCreativeTab(CreativeTab.reagent);
	public static ItemStone stoneblue = new ItemStone("stoneblue").setCreativeTab(CreativeTab.reagent);
	public static ItemStone stonebrown = new ItemStone("stonebrown").setCreativeTab(CreativeTab.reagent);
	public static ItemStone stonegreen = new ItemStone("stonegreen").setCreativeTab(CreativeTab.reagent);
	public static ItemStone stoneblack = new ItemStone("stoneblack").setCreativeTab(CreativeTab.reagent);
	
	//Level 1 stones	
	public static ItemStone stoneforest = new ItemStone("stoneforest").setCreativeTab(CreativeTab.reagent);
	public static ItemStone stonespider = new ItemStone("stonespider").setCreativeTab(CreativeTab.reagent);
	public static ItemStone stonecreeper = new ItemStone("stonecreeper").setCreativeTab(CreativeTab.reagent);
	public static ItemStone stonezombie = new ItemStone("stonezombie").setCreativeTab(CreativeTab.reagent);
	public static ItemStone stoneskeleton = new ItemStone("stoneskeleton").setCreativeTab(CreativeTab.reagent);
	public static ItemStone stonedesert = new ItemStone("stonedesert").setCreativeTab(CreativeTab.reagent);
	public static ItemStone stonefire = new ItemStone("stonefire").setCreativeTab(CreativeTab.reagent);
	public static ItemStone stonenether = new ItemStone("stonenether").setCreativeTab(CreativeTab.reagent);	
	
	//Level 2 stones
	public static ItemStone stonecoal = new ItemStone("stonecoal").setCreativeTab(CreativeTab.reagent);
	public static ItemStone stoneiron = new ItemStone("stoneiron").setCreativeTab(CreativeTab.reagent);
	public static ItemStone stoneredstone = new ItemStone("stoneredstone").setCreativeTab(CreativeTab.reagent);
	public static ItemStone stoneglass = new ItemStone("stoneglass").setCreativeTab(CreativeTab.reagent);
	public static ItemStone stoneglowstone = new ItemStone("stoneglowstone").setCreativeTab(CreativeTab.reagent);	
	public static ItemStone stonelapis = new ItemStone("stonelapis").setCreativeTab(CreativeTab.reagent);	
	
	//Level 3 stones
	public static ItemStone stonegold = new ItemStone("stonegold").setCreativeTab(CreativeTab.reagent);
	public static ItemStone stonewinter = new ItemStone("stonewinter").setCreativeTab(CreativeTab.reagent);
	public static ItemStone stoneclay = new ItemStone("stoneclay").setCreativeTab(CreativeTab.reagent);
	public static ItemStone stoneleather = new ItemStone("stoneleather").setCreativeTab(CreativeTab.reagent);
	public static ItemStone stonenetherwart = new ItemStone("stonenetherwart").setCreativeTab(CreativeTab.reagent);
	
	//Level 4 stones
	public static ItemStone stonediamond = new ItemStone("stonediamond").setCreativeTab(CreativeTab.reagent);
	public static ItemStone stoneblaze = new ItemStone("stoneblaze").setCreativeTab(CreativeTab.reagent);
	public static ItemStone stoneslime = new ItemStone("stoneslime").setCreativeTab(CreativeTab.reagent);
	public static ItemStone stoneobsidian = new ItemStone("stoneobsidian").setCreativeTab(CreativeTab.reagent);
	
	//Level 5 stones
	public static ItemStone stonemagma = new ItemStone("stonemagma").setCreativeTab(CreativeTab.reagent);
	public static ItemStone stoneemerald = new ItemStone("stoneemerald").setCreativeTab(CreativeTab.reagent);
	public static ItemStone stoneghast = new ItemStone("stoneghast").setCreativeTab(CreativeTab.reagent);
	public static ItemStone stoneend = new ItemStone("stoneend").setCreativeTab(CreativeTab.reagent);
	
	//Level 6 stones
	public static ItemStoneinfinity stoneinfinity = new ItemStoneinfinity("stoneinfinity").setCreativeTab(CreativeTab.reagent);
	
	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(
						
		//Main stones
		reagent1,
		reagent2,
		reagent3,
		reagent4,
		reagent5,
		reagent6,	
		reagentnugget,
		reagentingot,
		reagentjewel,
		alstone,
		stonecrafting,
		
		//Dye stones
		stonered,
		stoneyellow,
		stoneblue,
		stonebrown,
		stonegreen,
		stoneblack,
		
		//Level 1 stones	
		stoneforest,
		stonespider,
		stonecreeper,
		stonezombie,
		stoneskeleton,
		stonedesert,
		stonefire,
		stonenether,	
		
		//Level 2 stones
		stonecoal,
		stoneiron,
		stoneredstone,
		stoneglass,
		stoneglowstone,	
		stonelapis,
		
		//Level 3 stones
		stonegold,
		stonewinter,
		stoneclay,
		stoneleather,
		stonenetherwart,
		
		//Level 4 stones
		stonediamond,
		stoneblaze,
		stoneslime,
		stoneobsidian,
		
		//Level 5 stones
		stonemagma,
		stoneemerald,
		stoneghast,
		stoneend,
		
		//Level 6 stones
		stoneinfinity				
				
		);
	}

	public static void registerModels() {		
						
		//Main stones
		reagent1.registerItemModel();
		reagent2.registerItemModel();
		reagent3.registerItemModel();
		reagent4.registerItemModel();
		reagent5.registerItemModel();
		reagent6.registerItemModel();	
		reagentnugget.registerItemModel();
		reagentingot.registerItemModel();
		reagentjewel.registerItemModel();
		alstone.registerItemModel();
		stonecrafting.registerItemModel();
		
		//Dye stones
		stonered.registerItemModel();
		stoneyellow.registerItemModel();
		stoneblue.registerItemModel();
		stonebrown.registerItemModel();
		stonegreen.registerItemModel();
		stoneblack.registerItemModel();
		
		//Level 1 stones	
		stoneforest.registerItemModel();
		stonespider.registerItemModel();
		stonecreeper.registerItemModel();
		stonezombie.registerItemModel();
		stoneskeleton.registerItemModel();
		stonedesert.registerItemModel();
		stonefire.registerItemModel();
		stonenether.registerItemModel();	
		
		//Level 2 stones
		stonecoal.registerItemModel();
		stoneiron.registerItemModel();
		stoneredstone.registerItemModel();
		stoneglass.registerItemModel();
		stoneglowstone.registerItemModel();	
		
		//Level 3 stones
		stonegold.registerItemModel();
		stonewinter.registerItemModel();
		stoneclay.registerItemModel();
		stoneleather.registerItemModel();
		stonenetherwart.registerItemModel();
		stonelapis.registerItemModel();
		
		//Level 4 stones
		stonediamond.registerItemModel();
		stoneblaze.registerItemModel();
		stoneslime.registerItemModel();
		stoneobsidian.registerItemModel();
		
		//Level 5 stones
		stonemagma.registerItemModel();
		stoneemerald.registerItemModel();
		stoneghast.registerItemModel();
		stoneend.registerItemModel();
		
		//Level 6 stones
		stoneinfinity.registerItemModel();
		
	}
}