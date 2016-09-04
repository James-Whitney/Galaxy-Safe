package Galaxy.Safe.blocks;

import Galaxy.Safe.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSafe extends Block {

	public BlockSafe() {
		super(Material.WOOD);
		setUnlocalizedName(Reference.TutorialBlocks.SAFE.getUnlocalizedName());
		setRegistryName(Reference.TutorialBlocks.SAFE.getRegistryName());
	}

}
