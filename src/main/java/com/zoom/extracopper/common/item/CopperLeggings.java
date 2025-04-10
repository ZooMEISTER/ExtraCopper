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
 * @Name：CopperLeggins
 * @Description:
 * @Date：2025/4/10 15:55
 * @Filename：CopperLeggins
 */

public class CopperLeggings extends ArmorItem {
    public CopperLeggings(ArmorMaterial material, Item.Properties properties) {
        super(material, EquipmentSlot.HEAD, properties);
    }

    @Override
    public boolean isRepairable(ItemStack stack) {
        return material.getRepairIngredient().test(stack);
    }
}
