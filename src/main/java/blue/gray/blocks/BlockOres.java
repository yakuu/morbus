package blue.gray.blocks;

import blue.gray.Main;
import blue.gray.blocks.item.ItemBlockVarriants;
import blue.gray.init.ModBlocks;
import blue.gray.init.ModItems;
import blue.gray.util.IHasModel;
import blue.gray.util.IMetaName;
import blue.gray.util.handlers.EnumHandler;
import blue.gray.util.handlers.EnumHandler.EnumType;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class BlockOres extends Block implements IHasModel, IMetaName {
	
	public static final PropertyEnum<EnumHandler.EnumType> VARIANT = PropertyEnum.<EnumHandler.EnumType>create("variant", EnumHandler.EnumType.class); 
	private String name, dimension;
	
	
	public BlockOres(String name, String dimension) {
		super(Material.ROCK);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.SEARCH);
		setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumHandler.EnumType.MORBUS));
		
		this.name = name;
		this.dimension = dimension;
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlockVarriants(this).setRegistryName(this.getRegistryName()));
		
	}
	
	@Override
	public int damageDropped(IBlockState state) {
		return ((EnumHandler.EnumType)state.getValue(VARIANT)).getMeta();
	}
	
@Override
	public int getMetaFromState(IBlockState state) {
		return ((EnumHandler.EnumType)state.getValue(VARIANT)).getMeta();
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(VARIANT, EnumHandler.EnumType.byMetadata(meta));
	}

	
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
		return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(world.getBlockState(pos)));
	}
	
	@Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items) {
		for(EnumHandler.EnumType variant : EnumHandler.EnumType.values()) {
			items.add(new ItemStack(this, 1, variant.getMeta()));
		}
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] {VARIANT});
		}
	
	@Override
	public String getSpecialName(ItemStack stack) {
		return EnumHandler.EnumType.values()[stack.getItemDamage()].getName();
	}
	
	public void registerModels() {
		for(int i = 0; i < EnumHandler.EnumType.values().length; i++) {
			Main.proxy.registerVarriantRenderer(Item.getItemFromBlock(this), i, "ore_" + this.dimension + "_" + EnumHandler.EnumType.values()[i].getName(), "inventory");
		}
	}
	
}
