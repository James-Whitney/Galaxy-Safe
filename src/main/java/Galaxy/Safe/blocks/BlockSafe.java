package Galaxy.Safe.blocks;


import java.util.List;
import Galaxy.Safe.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockSafe extends Block {
																		 	//X1		Y1			Z1			X2			Y2			Z2	
	private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(	0/16.0,		0/16.0,		0/16.0,		16/16.0,	16/16.0,	15/16.0);
	private static final AxisAlignedBB COLLISION_BOX = new AxisAlignedBB(	1/16.0,		0/16.0,		1/16.0,		15/16.0,	16/16.0,	15/16.0);
	
	public BlockSafe() {
		super(Material.WOOD);
		setUnlocalizedName(Reference.SafeBlocks.SAFE.getUnlocalizedName());
		setRegistryName(Reference.SafeBlocks.SAFE.getRegistryName());
	}
	
	@Override
	public boolean isFullCube(IBlockState state){
		return false;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return BOUNDING_BOX;
	}
	
	@Override
	public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, Entity entityIn) {
		super.addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX);
	}

}
