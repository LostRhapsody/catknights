package lostrhapsody.catknights;

import lostrhapsody.catknights.item.ItemCKTabbyPick;
import lostrhapsody.catknights.item.ItemCKTabbySword;
import lostrhapsody.catknights.materials.ToolMaterials;
import lostrhapsody.catknights.util.RegistryUtil;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = CatKnights.MODID)
public class RegistrationHandler {

	@SubscribeEvent
	public static void registerItems(Register<Item> event) {
		final Item[] items = {
				RegistryUtil.setItemName(new ItemCKTabbySword(ToolMaterials.TOOL_TABBY), "tabby_sword").setCreativeTab(CatKnights.CatKnightsTab),
				RegistryUtil.setItemName(new ItemCKTabbyPick(ToolMaterials.TOOL_TABBY), "tabby_pick").setCreativeTab(CatKnights.CatKnightsTab),
				
		};
		
//		final Item[] itemBlocks = {
//				new ItemBlock(ModBlocks.BLOCKNAME).setRegistryName(ModBlocks.BLOCKNAME.getRegistryName())
//		};
		
		event.getRegistry().registerAll(items);
//		event.getRegistry().registerAll(itemBlocks);
	}

//	@SubscribeEvent
//	public static void registerBlocks(Register<Block> event) {
//		final Block[] blocks = {
//				RegistryUtil.setBlockName(new Block(Material.ROCK), "block_name").setCreativeTab(net.minecraft.creativetab.CreativeTabs.BUILDING_BLOCKS),
//		};
	
//		event.getRegistry().registerALL(blocks);
//	}
}
