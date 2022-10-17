package cz.drven.inventoryapi.main.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;
import java.util.List;

public class InventoryAPI {

    private String title;
    private int rows;
    private Inventory inv = null;

    public InventoryAPI(String title, int rows) {
        this.title = title;
        this.rows = rows;
        inv = Bukkit.createInventory(null, rows * 9, title);
    }

    public int getRows() {
        return rows;
    }

    public String getTitle() {
        return title;
    }

    public Inventory getInventory() {
        return inv;
    }

    public void setItem(int slot, Material material, String name, List<String> lores, Byte data, int amount) {
        ItemStack is = new ItemStack(material, amount, data);
        ItemMeta ismeta = is.getItemMeta();
        ismeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', name));
        ismeta.setLore(Collections.singletonList(ChatColor.translateAlternateColorCodes('&', lores.toString())));
        is.setItemMeta(ismeta);

        inv.setItem(slot, is);
    }

    public void open(Player p) {
        p.openInventory(inv);
    }

}
