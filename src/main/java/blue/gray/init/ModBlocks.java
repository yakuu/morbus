package blue.gray.init;

import java.util.ArrayList;
import java.util.List;

import blue.gray.blocks.BlockBase;
import blue.gray.blocks.BlockOres;
import blue.gray.blocks.Morbus_BedrockBlock;
import blue.gray.blocks.Morbus_BrickBlock;
import blue.gray.blocks.Morbus_DirtBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Building Blocks
	public static final Block MORBUS_DIRT_BLOCK = new Morbus_DirtBlock("morbus_dirt_block", Material.AIR);
	
	//Structure Blocks
	public static final Block MORBUS_BRICK_BLOCK = new Morbus_BrickBlock("morbus_brick_block", Material.GROUND);
	
	//Bedrock/Un-Mineable
	public static final Block MORBUS_BEDROCK_BLOCK = new Morbus_BedrockBlock("morbus_bedrock_block", Material.GROUND);
	
	//Ores
	public static final Block ORE_OVERWORLD = new BlockOres("ore_overworld", "overworld");
	
	
}
