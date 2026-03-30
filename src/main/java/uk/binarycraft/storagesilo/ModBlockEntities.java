package uk.binarycraft.storagesilo;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.eventbus.api.IEventBus;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
        DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Reference.MODID);

    public static final RegistryObject<BlockEntityType<BlockEntityStorageSilo>> STORAGE_SILO_BE =
        BLOCK_ENTITIES.register("storage_silo_be",
            () -> BlockEntityType.Builder.of(BlockEntityStorageSilo::new, ModBlocks.STORAGE_SILO_BLOCK.get()).build(null)
        );

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}