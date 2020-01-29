package blue.gray.util.handlers;

import blue.gray.blocks.container.ContainerMorbus_Chest;
import blue.gray.blocks.container.TileEntityMorbus_Chest;
import blue.gray.util.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler 
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == Reference.GUI_MORBUS_CHEST) 
		{
			return new ContainerMorbus_Chest(player.inventory, (TileEntityMorbus_Chest)world.getTileEntity(new BlockPos(x, y ,z)), player);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == Reference.GUI_MORBUS_CHEST) 
		{
			return new GuiMorbusChest(player.inventory, (TileEntityMorbus_Chest)world.getTileEntity(new BlockPos(x, y ,z)), player);
		}
		return null;
	}

	public static void RegisterGuis() {
		
	}
}
