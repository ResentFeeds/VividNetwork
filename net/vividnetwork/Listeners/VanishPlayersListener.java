package net.vividnetwork.VividNetwork.Listeners;

import net.vividnetwork.VividNetwork;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
 

public class VanishTorchListener implements Listener{
    
    
    public VividNetwork plugin;

    public VanishTorchListener(VividNetwork plugin){ 
    	this.plugin = plugin;
     }
		
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent e) {
        if (e.getPlayer().hasPermission("vanishtorch.use")) {
            if (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
                if (e.getItem().getType() == Material.MAGMA_CREAM) {
                    Player player = e.getPlayer();
                    for (Player other : getServer().getOnlinePlayers()) {
                        player.hidePlayer(other);
                        player.playSound(player.getLocation(), Sound.ANVIL_LAND, 10, 1);
                        player.getInventory().remove(new ItemStack(Material.MAGMA_CREAM));
                        player.getInventory().addItem(new ItemStack(Material.SLIME_BALL));
                        player.sendMessage(ChatColor.GREEN + "Players have been hidden!");
                        return;
                    }
                    return;
                }
                if (e.getItem().getType() == Material.SLIME_BALL) {
                    Player player = e.getPlayer();
                    for (Player other : getServer().getOnlinePlayers()) {
                        player.showPlayer(other);
                        player.playSound(player.getLocation(), Sound.ANVIL_BREAK, 10, 1);
                        player.getInventory().remove(new ItemStack(Material.SLIME_BALL));
                        player.getInventory().addItem(new ItemStack(Material.MAGMA_CREAM));
                        player.sendMessage(ChatColor.GREEN + "Players have been shown!");
                        return;
                    }
                    return;
                }
            }
        }
    }
 
}
