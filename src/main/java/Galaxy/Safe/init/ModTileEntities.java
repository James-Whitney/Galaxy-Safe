package Galaxy.Safe.init;

import Galaxy.Safe.tileEntities.tileEntitySafe;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModTileEntities {
	
	public static TileEntity safe;
	
	public static void init() {
		//One for each tile Entity
		safe = new tileEntitySafe();	
	}
	public static void register() {
		//One for each tile Entity
		GameRegistry.registerTileEntity(tileEntitySafe.class, "safe_tile_entity");
	}
}
