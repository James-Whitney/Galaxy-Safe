package Galaxy.Safe.blocks;

import Galaxy.Safe.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSafe extends Block {

	public BlockSafe() {
		super(Material.WOOD);
		setUnlocalizedName(Reference.SafeBlocks.SAFE.getUnlocalizedName());
		setRegistryName(Reference.SafeBlocks.SAFE.getRegistryName());
	}

}
