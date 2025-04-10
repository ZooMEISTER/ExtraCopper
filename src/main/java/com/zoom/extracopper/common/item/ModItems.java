package com.zoom.extracopper.common.item;


import com.zoom.extracopper.ExtraCopper;
import com.zoom.extracopper.client.ModCreativeTabs;
import com.zoom.extracopper.common.block.ModBlocks;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * @Author：ZooMEISTER
 * @Package：com.zoom.extracopper.common.item
 * @Project：ExtraCopper
 * @Name：ModItems
 * @Description: 注册物品
 * @Date：2025/4/8 16:08
 * @Filename：ModItems
 */

public class ModItems {

    // 物品注册器
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExtraCopper.MOD_ID);

    // 注册铜矿
    public static final RegistryObject<Item> SUPER_COPPER_ORE_ITEM = ITEMS.register(
            "super_copper_ore",
            () -> new BlockItem(
                    ModBlocks.SUPER_COPPER_ORE.get(),
                    new Item.Properties().tab(ModCreativeTabs.EXTRA_COPPER_TAB)
            )
    );

    // 注册铜头盔
    public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register(
            "copper_helmet",
            () -> new ArmorItem(
                    CopperArmorMaterial.COPPER,
                    EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeTabs.EXTRA_COPPER_TAB)
            )
    );
    // 注册铜胸甲
    public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register(
            "copper_chestplate",
            () -> new ArmorItem(
                    CopperArmorMaterial.COPPER,
                    EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeTabs.EXTRA_COPPER_TAB)
            )
    );
    // 注册铜裤子
    public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register(
            "copper_leggings",
            () -> new ArmorItem(
                    CopperArmorMaterial.COPPER,
                    EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeTabs.EXTRA_COPPER_TAB)
            )
    );
    // 注册铜靴子
    public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register(
            "copper_boots",
            () -> new ArmorItem(
                    CopperArmorMaterial.COPPER,
                    EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeTabs.EXTRA_COPPER_TAB)
            )
    );
}
