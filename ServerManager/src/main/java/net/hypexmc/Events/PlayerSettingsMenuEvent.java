package net.hypexmc.Events;

import net.hypexmc.Utils.Color;
import net.hypexmc.WithOutCommandsMenus.ChatSettingsMenu;
import net.hypexmc.WithOutCommandsMenus.NetworkSettingsMenu;
import net.hypexmc.WithOutCommandsMenus.PrivacySettingsMenu;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class PlayerSettingsMenuEvent implements Listener {

    @EventHandler
    public void InvClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();

        if (event.getClickedInventory() == null) return;
        String title = event.getClickedInventory().getTitle();
        if (title.equals(Color.add("&B&LPlayer &F&LSettings"))) {
            event.setCancelled(true);

            switch (event.getCurrentItem().getType()) {


                case ANVIL:

                    player.openInventory(new PrivacySettingsMenu("&B&LPrivacy &F&LSettings", 54).getInventory());

                    break;
                case BOOKSHELF:

                    player.openInventory(new NetworkSettingsMenu("&B&LNetwork &F&LSettings",54).getInventory());

                    break;
                case MINECART:

                    player.openInventory(new ChatSettingsMenu("&B&LChat &F&LSettings",54).getInventory());

                    break;
            }
        }
    }
}
