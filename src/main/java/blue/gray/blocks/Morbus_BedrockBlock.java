package blue.gray.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Morbus_BedrockBlock extends BlockBase 
{
	public Morbus_BedrockBlock(String Name, Material material) 
	{
		super(Name, material);
		setSoundType(SoundType.ANVIL);
		setHardness(31.5F);
		setResistance(1300F);
		setLightLevel(1F);
		//setLightOpacity(1);
		setBlockUnbreakable();
	}

}
