package Galaxy.Safe.proxy;

import Galaxy.Safe.init.ModBlocks;
import Galaxy.Safe.init.ModItems;
import Galaxy.Safe.init.ModTileEntities;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
		System.out.println("System PreInit");
		
		ModItems.init();
		ModItems.register();
		
		ModBlocks.init();
		ModBlocks.register();
		
		ModTileEntities.init();
	}

    public void init(FMLInitializationEvent e) {
		System.out.println("System Init");
    }

    public void postInit(FMLPostInitializationEvent e) {
		System.out.println("System PostInit");
    }
}
