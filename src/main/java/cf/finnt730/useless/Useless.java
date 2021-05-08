package cf.finnt730.useless;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
@Mod("useless")
public class Useless {
    private static final Logger LOGGER = LogManager.getLogger();
    public Useless() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);    }
    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
        LOGGER.info("The mod has been loaded, and will do nothing. You can remove it from the mods folder, and restart the client / modpack. I hope you will have fun playing tough! (Someone will read this.) ~ FinnT730");    }}
