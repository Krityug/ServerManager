package net.hypexmc.Utils;


import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class Item {
    public static ItemStack create(Material mat, int amount, String name) {
        ItemStack item = new ItemStack(mat, amount);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Color.add(name));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack create(Material mat, int amount, String name, String lore) {
        ItemStack item = new ItemStack(mat, amount);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Color.add(name));

        String[] split = lore.split(";");

        ArrayList<String> l = new ArrayList<String>();

        for (String aSplit : split) {
            l.add(Color.add(aSplit.replaceAll(";", "")));
        }

        meta.setLore(l);
        item.setItemMeta(meta);

        return item;
    }

    public static ItemStack create(ItemStack item, int amount, String name, String lore) {
        item.setAmount(amount);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Color.add(name));

        String[] split = lore.split(";");

        ArrayList<String> l = new ArrayList<String>();

        for (String aSplit : split) {
            l.add(Color.add(aSplit.replaceAll(";", "")));
        }

        meta.setLore(l);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);

        return item;
    }
}