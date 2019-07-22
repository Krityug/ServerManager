package net.hypexmc;

import net.hypexmc.Events.PlayerHotBarEvent;
import net.hypexmc.Events.PlayerSettingsMenuEvent;
import net.hypexmc.Menus.PlayerSettings;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class ServerManager extends JavaPlugin {

    @Override
    public void onEnable() {
       getLogger().info("Server Manager has been enabled");
        this.getCommand("settings").setExecutor(new PlayerSettings());
        Bukkit.getPluginManager().registerEvents(new PlayerHotBarEvent(),this);
        Bukkit.getPluginManager().registerEvents(new PlayerSettingsMenuEvent(),this);


    }

    @Override
    public void onDisable() {
        getLogger().info("Server Manager has been disabled");
    }
}
