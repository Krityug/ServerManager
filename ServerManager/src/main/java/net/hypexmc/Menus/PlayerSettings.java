package net.hypexmc.Menus;

import net.hypexmc.Utils.Color;
import net.hypexmc.Utils.Item;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class PlayerSettings implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command,String cmd,String[] args) {
        if(cmd.equalsIgnoreCase("settings")) {
            if(!(sender instanceof Player)) {
                sender.sendMessage(Color.add("&C&LError: &A&LYou must be a player to perform this command!"));
                return true;
            }


            Player player = (Player) sender;

            Inventory player_settings = Bukkit.createInventory(null,9,Color.add("&B&LPlayer &F&LSettings"));

            ItemStack privacy_settings = Item.create(Material.ANVIL,1,"&APrivacy Settings",
                    "&7Manage your privacy settings.;;&EClick to manage privacy settings!");

            player_settings.setItem(0,privacy_settings);


            ItemStack network_settings = Item.create(Material.BOOKSHELF,1,"&ANetwork Settings",
                    "&7Manage your Network Settings.;;&EClick to manage your network settings!");

            player_settings.setItem(4,network_settings);

            ItemStack chat_settings = Item.create(Material.MINECART,1,"&AChat Settings",
                    "&7Manage your chat settings,;;&EClick to manage your chat settings!");

            player_settings.setItem(8,chat_settings);




            player.openInventory(player_settings);




        }
        return true;
    }
}
