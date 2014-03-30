package net.vividnetwork.Commands;

import net.vividnetwork.VividNetwork;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WebsiteCommand implements CommandExecutor {

	
	public VividNetwork plugin;
	
	public WebsiteCommand(VividNetwork plugin){
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label,
			String[] args){
		if(sender instanceof Player){
			Player player = (Player) sender;
			player.sendMessage(ChatColor.GOLD+" -------- "+ ChatColor.AQUA.toString()+ChatColor.BOLD+" Website Link"+ ChatColor.GOLD+" -------- ");
			player.sendMessage(ChatColor.GRAY+"       http://www.vividnetwork.net     ");
			player.sendMessage(ChatColor.GOLD+" -------- "+ ChatColor.AQUA.toString()+ChatColor.BOLD+" Website Link"+ ChatColor.GOLD+" -------- ");
		}else{		
			sender.sendMessage(ChatColor.RED+"You need to be a player to do this Command!");
		}
	return false;
	}
}
