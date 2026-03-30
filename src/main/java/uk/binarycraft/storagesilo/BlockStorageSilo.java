package uk.binarycraft.storagesilo;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class BlockStorageSilo extends Block {
    public BlockStorageSilo() {
        super(BlockBehaviour.Properties.of(Material.METAL)
                .strength(6.0f, 10.0f)
                .requiresCorrectToolForDrops());
        // 可在此添加特别行为
    }

    // 以后可自定义 onUse、保存state等复杂逻辑
}