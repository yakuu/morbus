package blue.gray.blocks;

import blue.gray.Main;
import blue.gray.init.ModBlocks;
import blue.gray.init.ModItems;
import blue.gray.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel 
{
	public BlockBase(String Name, Material material)
	{
		super(material);
		setUnlocalizedName(Name);
		setRegistryName(Name);
		setCreativeTab(CreativeTabs.SEARCH);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
		
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
