package Galaxy.Safe.init;

import Galaxy.Safe.ModTileEntity;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModTileEntities {
	
	public static void init() {
		//One for each Tile Entity
        GameRegistry.registerTileEntity(ModTileEntity.class, "galaxysafe_safe_tile_entity");
    }
}
