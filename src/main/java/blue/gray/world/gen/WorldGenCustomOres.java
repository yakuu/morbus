package blue.gray.world.gen;

import java.util.Random;

import blue.gray.blocks.BlockOres;
import blue.gray.init.ModBlocks;
import blue.gray.util.handlers.EnumHandler;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;



public class WorldGenCustomOres implements IWorldGenerator{

	private WorldGenerator ore_overworld_morbus, ore_overworld_miron, ore_overworld_mgold;
	
	public WorldGenCustomOres()	{
		ore_overworld_morbus = new WorldGenMinable(ModBlocks.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.MORBUS), 2, BlockMatcher.forBlock(Blocks.STONE));
		ore_overworld_miron = new WorldGenMinable(ModBlocks.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.MIRON), 2, BlockMatcher.forBlock(Blocks.STONE));
		ore_overworld_mgold = new WorldGenMinable(ModBlocks.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.MGOLD), 2, BlockMatcher.forBlock(Blocks.STONE));
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		case -1:
			
			//Nether
			
			break;
			
		case 0:
			
			runGenerator(ore_overworld_morbus, world, random, chunkX, chunkZ, 50, 0, 100);
			runGenerator(ore_overworld_miron, world, random, chunkX, chunkZ, 50, 0, 100);
			runGenerator(ore_overworld_mgold, world, random, chunkX, chunkZ, 50, 0, 100);
			
			break;
			
		case 1:
			
			//End
		}
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight)
	{
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore generated out of bounds");
		
		int heightDiff = maxHeight - minHeight + 1;
		for(int i = 0; i < chance; i++)
		{
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x,y,z));
		}
	}
	

}
