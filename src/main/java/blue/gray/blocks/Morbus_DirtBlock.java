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
	
	//effect for MORBUS_DIRT_BLOCK
	//Randomly Placed between 20 and 50
	//Spreads like Mycelium but for Grass,Dirt,Stone:1:2:3
	//Mordus is a deasease so its fitting imo also not a bad looking block :P
	//This Effect can be stoped by Somekind of machine or something

}
