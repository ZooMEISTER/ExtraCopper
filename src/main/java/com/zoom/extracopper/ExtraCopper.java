package com.zoom.extracopper;


import com.zoom.extracopper.common.block.ModBlocks;
import com.zoom.extracopper.common.item.ModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

/**
 * @Author：ZooMEISTER
 * @Package：com.zoom.extracopper
 * @Project：ExtraCopper
 * @name：extracopper
 * @Date：2025/4/8 15:29
 * @Filename：extracopper
 */

@Mod(ExtraCopper.MOD_ID)
public class ExtraCopper {
    public static final String MOD_ID = "extracopper";

    public ExtraCopper() {
        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModBlocks.BLOCKS.register(bus);
        ModItems.ITEMS.register(bus);
    }
}
