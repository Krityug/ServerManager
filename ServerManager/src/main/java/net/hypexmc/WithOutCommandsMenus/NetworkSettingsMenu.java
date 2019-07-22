package net.hypexmc.WithOutCommandsMenus;

import net.hypexmc.Utils.Color;
import net.hypexmc.Utils.Item;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class NetworkSettingsMenu {

    private Inventory inventory;

    public NetworkSettingsMenu(String title,int size) {
        this.inventory = Bukkit.createInventory(null,size, Color.add(title));
        this.setItems();

    }

    public void setItems() {


        ItemStack messages = Item.create(Material.DIAMOND,1,"&B&LMessages &F&LOptions",
                "&7Click to enabled or disable your messages options!");


        inventory.setItem(10,messages);
    }

    public Inventory getInventory() {
        return inventory;
    }




}
