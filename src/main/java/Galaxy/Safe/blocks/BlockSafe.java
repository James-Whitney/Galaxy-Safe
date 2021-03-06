package Galaxy.Safe.blocks;


import java.util.Collection;
import java.util.List;

import Galaxy.Safe.Safe;
import Galaxy.Safe.tileEntities.tileEntitySafe;
import Galaxy.Safe.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockSafe extends BlockContainer {
																			//X1		Y1			Z1			X2			Y2			Z2	
	//private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(	0/16.0,		0/16.0,		0/16.0,		16/16.0,	16/16.0,	15/16.0);
	//private static final AxisAlignedBB COLLISION_BOX = new AxisAlignedBB(	1/16.0,		0/16.0,		1/16.0,		15/16.0,	16/16.0,	15/16.0);

	public BlockSafe() {
		super(Material.IRON);
		setUnlocalizedName(Reference.SafeBlocks.SAFE.getUnlocalizedName());
		setRegistryName(Reference.SafeBlocks.SAFE.getRegistryName());
		setCreativeTab(CreativeTabs.DECORATIONS);
		setHardness(50.0F);
		setResistance(2000.0F);
		setHarvestLevel("pickaxe", 2);
		//isBlockContainer = true;
		/*
		setUnlocalizedName	required	sets the name of the block	 
		setCreativeTab(	optional	sets the creative tab to display the block in	default: tabBlock
		setHardness	recommended	sets how long it takes to break the block	default:depends on material; stone:1.5F; obsidian:50.0F
		setResistance	recommended	sets the block's resistance against explosions	default:depends on material; stone:10.0F; obsidian:2000.0F
		setStepSound	recommended	sets the step sound of a block	default:depends on material
		setLightOpacity	optional	sets how much light is subtracted when going through this block
		This is only used if isOpaqueCube() returns false	default: 16 (completely opaque); maximum: 0 (100% translucent)
		setLightLevel	optional	sets how much light is emitted from the block	default: 0.0F (nothing); maximum: 1.0F (like full sunlight)
		setHarvestLevel	highly recommended sets the tool and the tool level to break a block. If you don't use this, the break level is defined by the material tool: "pickaxe", "axe", "shovel" level: 0=wood; 1=stone; 2=iron; 3=diamond tool
		setBlockUnbreakable	optional	makes the block unbreakable in survival	
		only bedrock and barriers are unbreakable
		setTickRandomly
		*/
		
	}
	/***** Tile Entity *****/
		@Override
	    public TileEntity createNewTileEntity(World worldIn, int meta) {return new tileEntitySafe();}
		@Override
		public EnumBlockRenderType getRenderType(IBlockState state) {return EnumBlockRenderType.MODEL;}

	/***** Modeling *****/
	//@Override
	//public boolean isFullCube(IBlockState state){return false;}
	//@Override
	//public boolean isOpaqueCube(IBlockState state) {return false;}
	//@Override
	//public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {return BOUNDING_BOX;}
	//@Override
	//public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, Entity entityIn) {super.addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX);}
	/********************/
		@Override
		public void breakBlock(World world, BlockPos pos, IBlockState blockstate) {
		    tileEntitySafe te = (tileEntitySafe) world.getTileEntity(pos);
		    InventoryHelper.dropInventoryItems(world, pos, te);
		    super.breakBlock(world, pos, blockstate);
		}

		@Override
		public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
		    if (stack.hasDisplayName()) {
		        ((tileEntitySafe) worldIn.getTileEntity(pos)).setCustomName(stack.getDisplayName());
		    }
		}

}
