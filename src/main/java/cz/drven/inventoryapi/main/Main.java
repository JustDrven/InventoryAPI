package cz.drven.inventoryapi.main;

import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        ConsoleCommandSender console = getServer().getConsoleSender();
        console.sendMessage("§8[§aInventoryAPI§8] §7Plugin was loaded");
    }

    @Override
    public void onDisable() {
        HandlerList.unregisterAll();
    }
}
