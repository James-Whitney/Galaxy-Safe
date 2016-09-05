package Galaxy.Safe.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	 public static void register() {
		 GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.safe), "OOO", "O O", "OOO", 'O', Blocks.OBSIDIAN);
		 //GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.jar),    " C ", "GGG", "CCC", 'C', Blocks.COAL_BLOCK, 'G', new ItemStack(Blocks.STAINED_GLASS,1,0));
	 }
}
