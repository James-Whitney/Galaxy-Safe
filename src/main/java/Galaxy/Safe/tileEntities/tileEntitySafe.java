package Galaxy.Safe.tileEntities;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;

public class tileEntitySafe extends TileEntity implements ITickable {

	private int age;
	
	public tileEntitySafe () {
		this.age = 0;
	}
	
	@Override
	public void update() {
		if (!this.worldObj.isRemote)
		{
			age++;
			System.out.println("ITS WORKING! I'M "+age+" TICKS OLD!");
		}
	}
	
	@Override
    public void writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        compound.setInteger("aInt", this.age);
        
        /*//Primitives:
        compound.setBoolean("aBoolean", this.aBoolean);
        compound.setByte("aByte", this.aByte);
        compound.setShort("aShort", this.aShort);
        compound.setInteger("anInt", this.anInt);
        compound.setLong("aLong", this.aLong);
        compound.setFloat("aFloat", this.aFloat);
        compound.setDouble("aDouble", this.aDouble);
        compound.setString("aString", this.aString);
        compound.setByteArray("aByteArray", this.aByteArray);
        compound.set
        IntArray("anIntArray", this.anIntArray);

        //Item Stack:
        NBTTagCompound stack = new NBTTagCompound();
        this.anItemStack.writeToNBT(stack);
        compound.setTag("anItemStack", stack);

        //TagList of Integer Tags:
        NBTTagList list = new NBTTagList();
        for (int i = 0; i < this.aList.size(); i++) {
            NBTTagCompound nbt = new NBTTagCompound();
            nbt.setInteger("id", i);
            nbt.setInteger("value", this.aList.get(i));
            list.appendTag(nbt);
        }
        compound.setTag("aList", list);*/
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        this.age = compound.getInteger("age");
/*        //Primitives:
        this.aBoolean = compound.getBoolean("aBoolean");
        this.aByte = compound.getByte("aByte");
        this.aShort = compound.getShort("aShort");
        this.anInt = compound.getInteger("anInt");
        this.aLong = compound.getLong("aLong");
        this.aFloat = compound.getFloat("aFloat");
        this.aDouble = compound.getDouble("aDouble");
        this.aString = compound.getString("aString");
        this.aByteArray = compound.getByteArray("aByteArray");
        this.anIntArray = compound.getIntArray("anIntArray");

        //ItemStack:
        this.anItemStack = ItemStack.loadItemStackFromNBT(compound.getCompoundTag("anItemStack"));

        //TagList of Integer Tags:
        NBTTagList list = compound.getTagList("aList", 10);
        this.aList.clear();
        for (int i = 0; i < list.tagCount(); i++) {
            NBTTagCompound nbt = list.getCompoundTagAt(i);
            int id = nbt.getInteger("id");
            int value = nbt.getInteger("value");
            this.aList.ensureCapacity(id);
            this.aList.set(id, value);
        }*/
    }
    
	
}
