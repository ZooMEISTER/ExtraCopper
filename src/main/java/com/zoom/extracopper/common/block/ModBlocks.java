package com.zoom.extracopper.common.block;


import com.zoom.extracopper.ExtraCopper;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * @Author：ZooMEISTER
 * @Package：com.zoom.extracopper.common.block
 * @Project：ExtraCopper
 * @Name：ModBlocks
 * @Description: 注册方块
 * @Date：2025/4/8 16:06
 * @Filename：ModBlocks
 */

public class ModBlocks {

    // 方块注册器
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ExtraCopper.MOD_ID);

    // 注册超级铜矿
    public static final RegistryObject<Block> SUPER_COPPER_ORE = BLOCKS.register(
            "super_copper_ore",
            () -> new Block(BlockBehaviour.Properties
                    .of(Material.STONE)   // 设定材质，影响音效和工具适配
                    .strength(1.5f, 6.0f) // 破坏速度 & 爆炸抗性
                    .requiresCorrectToolForDrops() // 需要合适的工具才会掉落
                    .sound(SoundType.STONE) // 设定声音
            )
    );
}
