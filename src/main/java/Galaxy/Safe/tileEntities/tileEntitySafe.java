package Galaxy.Safe.tileEntities;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class tileEntitySafe extends TileEntity implements IInventory {
	
	private ItemStack[] inventory;
	private String customName;
	
	public tileEntitySafe() {
		this.inventory = new ItemStack[this.getSizeInventory()];
	}
	
	/********** Data storage **********/
	@Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        
        
		return compound;
        
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

    /********** IInventory **********/
	@Override
	public String getName() {return customName;}

	@Override
	public boolean hasCustomName() {
		if(customName == null)
			return false;
		return true;
	}

	@Override
	public int getSizeInventory() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ItemStack getStackInSlot(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemStack decrStackSize(int index, int count) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemStack removeStackFromSlot(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setInventorySlotContents(int index, ItemStack stack) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getInventoryStackLimit() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void openInventory(EntityPlayer player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeInventory(EntityPlayer player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isItemValidForSlot(int index, ItemStack stack) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getField(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setField(int id, int value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getFieldCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
    
	
}
