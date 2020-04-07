package lostrhapsody.catknights;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = CatKnights.MODID, name = CatKnights.NAME, version = CatKnights.VERSION)
public class CatKnights {	
	
	public static final String MODID = "catknights";
    public static final String NAME = "Cat Knights";
    public static final String VERSION = "1.0.0";
    public static final String MC_VERSION = "[1.12.2]";
    
//  TODO: Proxies are dead?
//  @SidedProxy(clientSide = "lostrhapsody.catknights.proxy.ClientProxy", serverSide = "lostrhapsody.catknights.proxy.ServerProxy")
//	public static CommonProxy proxy;
    
	@Mod.Instance
	public static CatKnights instance;
	
	public static Logger LOGGER = LogManager.getLogger(MODID);
	
	public static final CreativeTabs CatKnightsTab = new CatKnightsTab();
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent e) {
		LOGGER.info(CatKnights.NAME + " says hi");
//		ModRecipes.initSmelting();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
	}
}
