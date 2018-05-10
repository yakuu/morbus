package blue.gray.blocks.item;

import blue.gray.util.IMetaName;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockVarriants extends ItemBlock {

	public ItemBlockVarriants(Block block) {
		super(block);
		setHasSubtypes(true);
		setMaxDamage(0);
	}
	
	public int getMetaData(int damage) {
		return damage;
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return super.getUnlocalizedName() + "_" + ((IMetaName)this.block).getSpecialName(stack);
	}
	
	
}
