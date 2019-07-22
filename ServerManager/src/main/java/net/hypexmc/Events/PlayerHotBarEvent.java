package net.hypexmc.Events;

import net.hypexmc.Utils.Item;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerHotBarEvent implements Listener {


    @EventHandler
    public void onJoin(PlayerJoinEvent event) {

        Player player = event.getPlayer();

        ItemStack island_settings = Item.create(Material.FURNACE,1,"&B&LIsland &F&LSettings",
                "&7Click to manage your island settings!");

        player.getInventory().setItem(8,island_settings);



    }

    @EventHandler
    public void onItemInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        ItemStack item = player.getItemInHand();

        if (item == null) return;
        if (!item.hasItemMeta()) return;
        if (!item.getItemMeta().hasDisplayName()) return;

        String itemName = item.getItemMeta().getDisplayName();
        String island_settings = "&B&LIsland &F&LSettings";

        if (getColors(itemName).equals(getColors(island_settings)))
        {
            Bukkit.dispatchCommand(event.getPlayer(), "is settings");
        }
    }

    private String getColors(String string) {
        return ChatColor.translateAlternateColorCodes('&', string);
    }




}
