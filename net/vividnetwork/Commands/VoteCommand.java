package net.vividnetwork.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.vividnetwork.VividNetwork;

public class VoteCommand implements CommandExecutor{
	
	public VividNetwork plugin;

	public VoteCommand(VividNetwork plugin){
		this.plugin = plugin;
	}
	  
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label,
			String[] args){
		if(sender instanceof Player){
			Player player = (Player) sender;
			player.sendMessage(ChatColor.GOLD+" -------- "+ ChatColor.AQUA.toString()+ChatColor.BOLD+" Vote Link"+ ChatColor.GOLD+" -------- ");
			player.sendMessage(ChatColor.GREEN+"       http://www.vividnetwork.net/vote    ");
			player.sendMessage(ChatColor.GOLD+" -------- "+ ChatColor.AQUA.toString()+ChatColor.BOLD+" Vote Link"+ ChatColor.GOLD+" -------- ");
		}else{
			sender.sendMessage(ChatColor.RED+"You need to be a player to do this command!");
		}
		return false;
	}

}
