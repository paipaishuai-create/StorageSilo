package uk.binarycraft.storagesilo;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;

public class StorageSiloMenu extends AbstractContainerMenu {
    private final BlockEntityStorageSilo tile;

    public StorageSiloMenu(int id, Inventory playerInv, BlockEntityStorageSilo tile) {
        super(ModMenuTypes.STORAGE_SILO_MENU.get(), id);
        this.tile = tile;

        // Silo Inventory slot (1 slot for demo; expand as needed)
        this.addSlot(new Slot(new SimpleContainer(tile.getItems().toArray(new ItemStack[0])), 0, 80, 36));

        // Player main inventory
        for (int row = 0; row < 3; ++row)
            for (int col = 0; col < 9; ++col)
                this.addSlot(new Slot(playerInv, col + row * 9 + 9, 8 + col * 18, 84 + row * 18));
        // Hotbar
        for (int col = 0; col < 9; ++col)
            this.addSlot(new Slot(playerInv, col, 8 + col * 18, 142));
    }

    @Override
    public boolean stillValid(Player player) {
        return true;
    }

    @Override
    public ItemStack quickMoveStack(Player player, int index) {
        return ItemStack.EMPTY;
    }
}
