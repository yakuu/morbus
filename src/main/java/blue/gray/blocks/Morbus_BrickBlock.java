package blue.gray.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Morbus_BrickBlock extends BlockBase 
{
	public Morbus_BrickBlock(String Name, Material material) 
	{
		super(Name, material);
		setSoundType(SoundType.STONE);
		setHardness(1.5F);
		setResistance(300F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(1F);
		//setLightOpacity(1);
	}

}
