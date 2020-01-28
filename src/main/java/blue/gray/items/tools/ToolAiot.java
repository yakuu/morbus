package blue.gray.items.tools;

import java.util.Set;

import com.google.common.collect.Sets;

import blue.gray.Main;
import blue.gray.init.ModItems;
import blue.gray.util.IHasModel;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.block.material.Material;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ToolAiot extends ItemAxe implements IHasModel {
	public ToolAiot(String name, ToolMaterial material) 
	{
		super(material, 12.0f, -1.4f);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.SEARCH);
		
		ModItems.ITEMS.add(this);
	}
	
    @Override
    public boolean canHarvestBlock(IBlockState state, ItemStack stack) {
        return state.getBlock() == Blocks.SNOW_LAYER || state.getBlock() == Blocks.SNOW || (state.getBlock() == Blocks.OBSIDIAN ? this.toolMaterial.getHarvestLevel() >= 3 : state.getBlock() != Blocks.DIAMOND_BLOCK && state.getBlock() != Blocks.DIAMOND_ORE ? state.getBlock() != Blocks.EMERALD_ORE && state.getBlock() != Blocks.EMERALD_BLOCK ? state.getBlock() != Blocks.GOLD_BLOCK && state.getBlock() != Blocks.GOLD_ORE ? state.getBlock() != Blocks.IRON_BLOCK && state.getBlock() != Blocks.IRON_ORE ? state.getBlock() != Blocks.LAPIS_BLOCK && state.getBlock() != Blocks.LAPIS_ORE ? state.getBlock() != Blocks.REDSTONE_ORE && state.getBlock() != Blocks.LIT_REDSTONE_ORE ? state.getMaterial() == Material.ROCK || state.getMaterial() == Material.IRON || state.getMaterial() == Material.ANVIL : this.toolMaterial.getHarvestLevel() >= 2 : this.toolMaterial.getHarvestLevel() >= 1 : this.toolMaterial.getHarvestLevel() >= 1 : this.toolMaterial.getHarvestLevel() >= 2 : this.toolMaterial.getHarvestLevel() >= 2 : this.toolMaterial.getHarvestLevel() >= 2);
    }	
	
    @Override
    public Set<String> getToolClasses(ItemStack stack) {
        return Sets.newHashSet("pickaxe", "axe", "shovel");
    }
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0,"inventory");
	}
	   
    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
        return super.canApplyAtEnchantingTable(stack, enchantment) || enchantment.type.canEnchantItem(Items.DIAMOND_SWORD);
    }
	
	@SubscribeEvent
	public void itemToolTip(ItemTooltipEvent event) 
	{

	}

}
