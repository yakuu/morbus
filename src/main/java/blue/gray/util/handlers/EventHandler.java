package blue.gray.util.handlers;

import java.util.Random;

import blue.gray.gui.GuiOverlay;
import blue.gray.init.ModItems;
import net.minecraft.command.AdvancementCommand;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventHandler {
	
	
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
	
	//Start for Advancements to run a command "/gamestage add player tutorial"
	@SubscribeEvent
	public void onJoinWorld(EntityJoinWorldEvent event){
		if(event.getEntity() instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer)event.getEntity();
		}
	}
	
	
	
}
