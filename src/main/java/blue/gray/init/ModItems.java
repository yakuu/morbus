package blue.gray.init;

import java.util.ArrayList;
import java.util.List;

import blue.gray.items.ItemBase;
import blue.gray.items.Morbus_Angel_Gem;
import blue.gray.items.tools.ToolAiot;
import blue.gray.items.tools.ToolAxe;
import blue.gray.items.tools.ToolPickaxe;
import blue.gray.items.tools.ToolSpade;
import blue.gray.items.tools.ToolSword;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item MORBUS_BRICK = new ItemBase("morbus_brick");
	
	public static final Item MORBUS_CAULDRON = new ItemBase("morbus_cauldron");
	
	
	//Materials
	public static final ToolMaterial MATERIAL_MORBUS = EnumHelper.addToolMaterial("material_morbus", 2, 1244, 6.0f, 3.0f, 10);
	
	//Planned function to emit light around it
	public static final Item MORBUS_ANGEL_GEM = new Morbus_Angel_Gem("morbus_angel_gem");
	
	//27.01.2020 Added Tools to the registry
	public static final ItemSpade MORBUS_TOOL_SHOVEL = new ToolSpade("morbus_shovel", MATERIAL_MORBUS);
	public static final ItemPickaxe MORBUS_TOOL_PICKAXE = new ToolPickaxe("morbus_pickaxe", MATERIAL_MORBUS);
	public static final ItemAxe MORBUS_TOOL_AXE = new ToolAxe("morbus_axe", MATERIAL_MORBUS);
	public static final ItemSword MORBUS_TOOL_SWORD = new ToolSword("morbus_sword", MATERIAL_MORBUS);
	public static final ToolAiot MORBUS_TOOL_AIOT = new ToolAiot("morbus_aiot", MATERIAL_MORBUS);
	
	
	
	
}
