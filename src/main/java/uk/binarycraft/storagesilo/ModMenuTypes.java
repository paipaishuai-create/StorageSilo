package uk.binarycraft.storagesilo;

import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.eventbus.api.IEventBus;

public class ModMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(ForgeRegistries.MENU_TYPES, Reference.MODID);

    public static final RegistryObject<MenuType<StorageSiloMenu>> STORAGE_SILO_MENU =
        MENUS.register("storage_silo_menu", () -> net.minecraftforge.common.extensions.IForgeMenuType.create(StorageSiloMenu::new));

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}