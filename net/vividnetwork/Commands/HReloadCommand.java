package net.vividnetwork.Commands;

import net.vividnetwork.VividNetwork;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HReloadCommand implements CommandExecutor {

	public VividNetwork plugin;

	public HReloadCommand(VividNetwork plugin) {
		this.plugin = plugin;
	}

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
	  if(sender instanceof Player){
		Player player = (Player) sender;

	             if(player.hasPermission("hub.reload")) {
				if(label.equalsIgnoreCase("hreload")){
			plugin.reloadConfig();
			sender.sendMessage(ChatColor.GREEN + "Successfully Reloaded!");
		}
				
		}else{
			player.sendMessage(ChatColor.RED+"VividNetwork does not know this command… oh no.");
		}
	  }else{
		  sender.sendMessage(ChatColor.RED+"You need to be a player to do this command!");
	  }
	return false;
	}

}
