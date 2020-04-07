package lostrhapsody.catknights;

import lostrhapsody.catknights.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CatKnightsTab extends CreativeTabs {
	
	public CatKnightsTab() {
		super(CatKnights.MODID);
	}

	@SideOnly(Side.CLIENT)
	public ItemStack createIcon() {
		return new ItemStack(ModItems.ItemCKTabbySword);
	}

	@Override
	public ItemStack getTabIconItem() {
		// TODO Auto-generated method stub
		return null;
	}

}
