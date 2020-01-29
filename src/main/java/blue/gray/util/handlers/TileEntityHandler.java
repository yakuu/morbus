package blue.gray.util.handlers;

import blue.gray.blocks.container.TileEntityMorbus_Chest;
import blue.gray.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
	public static void registerTileEntities() {
		GameRegistry.registerTileEntity(TileEntityMorbus_Chest.class, new ResourceLocation(Reference.MOD_ID + ":morbus_chest"));
	}
}
