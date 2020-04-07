package lostrhapsody.catknights.util;

import lostrhapsody.catknights.CatKnights;
//import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class RegistryUtil {
	
	public static Item setItemName(final Item item, final String name) {
		item.setRegistryName(CatKnights.MODID, name).setUnlocalizedName(CatKnights.MODID + "." + name);
		return item;
	}
	
//	public static Block setBlockName(final Block block, final String name) {
//		block.setRegistryName(CatKnights.MODID, name).setUnlocalizedName(CatKnights.MODID + "." + name);
//	}

}
