package blue.gray.gui;

import blue.gray.blocks.container.ContainerMorbus_Chest;
import blue.gray.blocks.container.TileEntityMorbus_Chest;
import blue.gray.util.Reference;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class Gui_Morbus_Chest extends GuiContainer 
{
	private static final ResourceLocation GUI_MORBUS_CHEST = new ResourceLocation(Reference.MOD_ID + ":textures/gui/container/morbus_chest.png");
	private final InventoryPlayer playerInv;
	private final TileEntityMorbus_Chest te;
	
	public Gui_Morbus_Chest(InventoryPlayer playerInv, TileEntityMorbus_Chest chestInv, EntityPlayer player) 
	{
		super(new ContainerMorbus_Chest(playerInv, chestInv, player));
		this.playerInv = playerInv;
		this.te = chestInv;
		
		this.xSize = 351;
		this.ySize = 443;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) 
	{
		GlStateManager.color(1.0f, 1.0f, 1.0f);
		this.mc.getTextureManager().bindTexture(GUI_MORBUS_CHEST);
		this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) 
	{
		this.fontRenderer.drawString(this.te.getDisplayName().getUnformattedText(), 8, 6, 000000);
		this.fontRenderer.drawString(this.playerInv.getDisplayName().getUnformattedText(), 8, this.ySize - 92, 000000);
	}
}
