package Galaxy.Safe.proxy;

import Galaxy.Safe.init.ModBlocks;
import Galaxy.Safe.init.ModItems;

public class ClientProxy implements CommonProxy {

	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}

}
