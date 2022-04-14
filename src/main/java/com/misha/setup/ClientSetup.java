package com.misha.setup;


import com.misha.blocks.*;
import com.misha.lavaplus.LavaPlus;
import com.misha.setup.Registration;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientSetup {


    public static void setup(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            MenuScreens.register(Registration.BLOCKBURNER_CONTAINER.get(), BlockBurnerScreen::new);
            MenuScreens.register(Registration.COALINFUSER_CONTAINER.get(), CoalInfuserScreen::new);
            MenuScreens.register(Registration.INDUCTIONFURNACE_CONTAINER.get(), InductionFurnaceScreen::new);
            MenuScreens.register(Registration.LAVAGENERATOR_CONTAINER.get(), LavaGeneratorScreen::new);
            MenuScreens.register(Registration.BATTERY_CONTAINER.get(), BatteryScreen::new);
            MenuScreens.register(Registration.CENTRIFUGE_CONTAINER.get(), CentrifugeScreen::new);
            MenuScreens.register(Registration.COMPRESSOR_CONTAINER.get(), CompressorScreen::new);
            MenuScreens.register(Registration.UPGRADER_CONTAINER.get(), UpgraderScreen::new);
            MenuScreens.register(Registration.CRATE_CONTAINER.get(), CrateScreen::new);

        });
    }
}