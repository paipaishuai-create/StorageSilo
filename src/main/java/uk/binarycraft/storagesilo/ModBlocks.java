package uk.binarycraft.storagesilo;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MODID);

    // 示例：定义主存储筒方块（命名与老版一致，可后续添加更多方块）
    public static final RegistryObject<Block> STORAGE_SILO_BLOCK = BLOCKS.register(
            "storage_silo",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6.0f, 10.0f)
                    .requiresCorrectToolForDrops()
            )
    );

    // 示例：如有其它方块可继续注册

    // 注册方块物品（放置到背包栏）
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MODID);

    public static final RegistryObject<Item> STORAGE_SILO_BLOCK_ITEM = ITEMS.register(
            "storage_silo",
            () -> new BlockItem(STORAGE_SILO_BLOCK.get(), new Properties())
    );

    // Forge 推荐入口注册方式
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
}
