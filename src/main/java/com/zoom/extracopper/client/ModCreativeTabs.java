package com.zoom.extracopper.client;


import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/**
 * @Author：ZooMEISTER
 * @Package：com.zoom.extracopper.client
 * @Project：ExtraCopper
 * @Name：ModCreativeTabs
 * @Description: mod 五物品栏
 * @Date：2025/4/9 09:28
 * @Filename：ModCreativeTabs
 */

public class ModCreativeTabs {
    public static final CreativeModeTab EXTRA_COPPER_TAB = new CreativeModeTab("extra_copper_tab") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(Items.COPPER_INGOT); // 设置图标
        }
    };
}
