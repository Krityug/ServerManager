package net.hypexmc.WithOutCommandsMenus;

import net.hypexmc.Utils.Color;
import net.hypexmc.Utils.Item;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class PrivacySettingsMenu {
    private Inventory inventory;

    public PrivacySettingsMenu(String title, int size) {
        this.inventory = Bukkit.createInventory(null, size, Color.add(title));
        this.setItems();
    }

    public void setItems() {
        ItemStack anvil = Item.create(Material.ANVIL,1,"&B&LPlayer Options",
                "&7Hello");


        inventory.setItem(10,anvil);
    }

    public Inventory getInventory() {
        return inventory;
    }
}
