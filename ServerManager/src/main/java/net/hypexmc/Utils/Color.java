package net.hypexmc.Utils;


import org.bukkit.ChatColor;

public class Color
{

    public static String add(String text)
    {
        return ChatColor.translateAlternateColorCodes('&', text);
    }

}