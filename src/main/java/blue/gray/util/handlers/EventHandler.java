package blue.gray.util.handlers;

import blue.gray.init.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.Constants.NBT;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventHandler {

	@SubscribeEvent
	public void MobDrops(LivingDropsEvent event) {
		if(event.getEntity()instanceof EntityMob) {
			event.getDrops().add(new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, new ItemStack(ModItems.MORBUS_BRICK)));
		}
	}
	
	//Drops Morbus_Brick if any monster is hit by Minecraft:Brick || Only Main Hand so far, maybe getHeldItemMainhand(Hand) soon
	@SubscribeEvent
	public void livingHurt(LivingHurtEvent event) {
		if(event.getSource().getTrueSource() instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.getSource().getTrueSource();
			if(player.getHeldItemMainhand() != null) {
				NBTTagCompound nbttagcompound = null;
				if(player.getHeldItemMainhand().getItem() == Items.BRICK) {
				player.addItemStackToInventory(new ItemStack(ModItems.MORBUS_BRICK));
				player.inventory.clearMatchingItems(Items.BRICK, 0, 1,nbttagcompound);
				}	
			}
		}
	}
}
