package blue.gray.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;


@EventBusSubscriber
public class GuiOverlay extends Gui {
	private final ResourceLocation bar = new ResourceLocation("morbus:textures/gui/hpbar.png");
	private final int tex_width = 102, tex_height = 8, bar_width = 100, bar_height = 6;	
	
	public void renderOverlay(RenderGameOverlayEvent event) {
		if(!event.isCancelable() && event.getType() == ElementType.EXPERIENCE) {
			Minecraft mc = Minecraft.getMinecraft();
			if(!mc.player.capabilities.isCreativeMode) {
				int posX = event.getResolution().getScaledWidth() / 2 + 10;
				int posY = event.getResolution().getScaledHeight() - 48;
				mc.renderEngine.bindTexture(bar);
				mc.ingameGUI.drawTexturedModalRect(posX, posY, 0, 0, tex_width, tex_height);
				mc.ingameGUI.drawTexturedModalRect(posX +1, posY +1, 0, 9, bar_width, bar_height);
			}
		}
		
	}
}
