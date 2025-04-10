package com.zoom.extracopper.common.item;


import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

/**
 * @Author：ZooMEISTER
 * @Package：com.zoom.extracopper.common.item
 * @Project：ExtraCopper
 * @Name：CopperChestplate
 * @Description: 铜胸甲
 * @Date：2025/4/10 15:54
 * @Filename：CopperChestplate
 */

public class CopperChestplate extends ArmorItem {
    public CopperChestplate(ArmorMaterial material, Item.Properties properties) {
        super(material, EquipmentSlot.HEAD, properties);
    }

    @Override
    public boolean isRepairable(ItemStack stack) {
        return material.getRepairIngredient().test(stack);
    }
}
