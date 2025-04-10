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
 * @Name：CopperHelmetItem
 * @Description: 铜头盔
 * @Date：2025/4/10 14:58
 * @Filename：CopperHelmetItem
 */

public class CopperHelmetItem extends ArmorItem {
    public CopperHelmetItem(ArmorMaterial material, Item.Properties properties) {
        super(material, EquipmentSlot.HEAD, properties);
    }

    @Override
    public boolean isRepairable(ItemStack stack) {
        return material.getRepairIngredient().test(stack);
    }
}
