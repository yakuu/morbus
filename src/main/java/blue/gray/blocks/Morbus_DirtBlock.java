package blue.gray.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Morbus_DirtBlock extends BlockBase 
{
	public Morbus_DirtBlock(String Name, Material material) 
	{
		super(Name, material);
		setSoundType(SoundType.CLOTH);
		setHardness(0.3F);
		setResistance(300F);
		setHarvestLevel("pickaxe", 0);
		setLightLevel(1F);
		//setLightOpacity(1);
	}

}
