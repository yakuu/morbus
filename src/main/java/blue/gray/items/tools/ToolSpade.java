package blue.gray.items.tools;

import blue.gray.Main;
import blue.gray.init.ModItems;
import blue.gray.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ToolSpade extends ItemSpade implements IHasModel {
	
	public ToolSpade(String name, ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.SEARCH);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0,"inventory");
	}
	
	@SubscribeEvent
	public void itemToolTip(ItemTooltipEvent event) 
	{

	}
}
