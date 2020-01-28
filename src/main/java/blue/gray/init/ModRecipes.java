package blue.gray.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		GameRegistry.addSmelting(ModItems.MORBUS_BRICK, new ItemStack(Items.BRICK, 1),0.3f);
	}
}
