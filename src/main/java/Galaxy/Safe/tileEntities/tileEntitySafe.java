package Galaxy.Safe.tileEntities;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import net.minecraft.util.text.ITextComponent;

public class tileEntitySafe extends TileEntity implements ITickable {

	private static int age;
	
	public tileEntitySafe () {
		this.age = 0;
	}
	
	@Override
	public void update() {
		age++;
		System.out.println("ITS WORKING! I'M "+age+" TICKS OLD!");
	}
}
