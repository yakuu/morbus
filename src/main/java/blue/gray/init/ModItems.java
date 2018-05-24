package blue.gray.init;

import java.util.ArrayList;
import java.util.List;

import blue.gray.items.ItemBase;
import blue.gray.items.Morbus_Angel_Gem;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item MORBUS_BRICK = new ItemBase("morbus_brick");
	
	public static final Item MORBUS_CAULDRON = new ItemBase("morbus_cauldron");
	
	
	
	//Planned function to emit light around it
	public static final Item MORBUS_ANGEL_GEM = new Morbus_Angel_Gem("morbus_angel_gem");
	
}
