package blue.gray;

import blue.gray.gui.GuiOverlay;
import blue.gray.init.ModBlocks;
import blue.gray.init.ModCrafting;
import blue.gray.init.ModItems;
import blue.gray.proxy.CommonProxy;
import blue.gray.util.Reference;
import blue.gray.util.handlers.RegistryHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main 
{
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)	{
		RegistryHandler.otherRegistries();
	}
	@EventHandler
	public static void Init(FMLInitializationEvent event)
	{
		//ModCrafting.register(); not used anymore since .json implementation
	}
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event)
	{
		MinecraftForge.EVENT_BUS.register(new blue.gray.util.handlers.EventHandler());
		MinecraftForge.EVENT_BUS.register(new GuiOverlay());
	}
}

