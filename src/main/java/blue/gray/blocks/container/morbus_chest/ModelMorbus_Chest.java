package blue.gray.blocks.container.morbus_chest;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelMorbus_Chest extends ModelBase {
	private final ModelRenderer bb_main;
	public Object chestLid, chestKnob, chestBelow;

	public ModelMorbus_Chest() {
		textureWidth = 64;
		textureHeight = 64;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -5.0F, -6.0F, -7.0F, 10, 6, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -5.0F, -6.0F, 5.0F, 10, 6, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -6.0F, -6.0F, -7.0F, 1, 6, 13, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 5.0F, -6.0F, -7.0F, 1, 6, 13, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -5.0F, -1.0F, -6.0F, 10, 1, 11, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -5.0F, -6.0F, -6.0F, 10, 1, 11, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -6.0F, -7.0F, -7.0F, 12, 1, 13, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bb_main.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
	
	public void renderAll()
	{
		this.bb_main.rotateAngleX = this.bb_main.rotateAngleX;
		this.bb_main.render(0.0625f);
		this.bb_main.render(0.0625f);
		this.bb_main.render(0.0625f);
	}
}