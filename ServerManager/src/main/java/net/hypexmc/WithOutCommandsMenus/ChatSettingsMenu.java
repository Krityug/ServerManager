package net.hypexmc.WithOutCommandsMenus;

import net.hypexmc.Utils.Color;
import net.hypexmc.Utils.Item;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ChatSettingsMenu {

    private Inventory inventory;


    public ChatSettingsMenu(String title,int size) {
        this.inventory = Bukkit.createInventory(null,54, Color.add(title));
        this.setItems();
    }

    public void setItems() {


        ItemStack bad_words = Item.create(Material.REDSTONE,1,"&B&LBad &F&LWords",
                "&7Enabling this option willreport ;&7bad words to staff automatically.");



        inventory.setItem(10,bad_words);
    }

    public Inventory getInventory() {
        return inventory;
    }

}
