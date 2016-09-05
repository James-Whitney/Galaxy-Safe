package Galaxy.Safe;

import Galaxy.Safe.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
		modid = Reference.MOD_ID, 
		name = Reference.NAME, 
		version = Reference.VERSION, 
		acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)

public class Safe {

	@Instance
	public static Safe instance;
	
	/********** Proxies **********/
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) { proxy.preInit(e);}
	@EventHandler
	public void init(FMLInitializationEvent e) {proxy.init(e);}
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {proxy.postInit(e);}
	/*****************************/
}
