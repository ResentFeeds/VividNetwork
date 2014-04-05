package net.vividnetwork.Commands;


import net.vividnetwork.VividNetwork;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WarnCommand implements CommandExecutor{

	public VividNetwork plugin;

	
	public WarnCommand(VividNetwork plugin){
		this.plugin = plugin;
	}


    		@Override
    		public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
    			if(sender instanceof Player){
    				Player player = (Player) sender;
    				if(label.equalsIgnoreCase("warn")){
    					if(args.length < 2){
    						player.sendMessage(ChatColor.RED + "/warn <player> <reason>");
    						return false;
    					}
    					Player targetplayer = plugin.getServer().getPlayer(args[0]);
    					
    					if(args.length == 1){
    						if(args[0].equalsIgnoreCase(args[0])){
    							if(targetplayer == null){
    								player.sendMessage(ChatColor.RED + "The Player " + ChatColor.DARK_RED + args[0] + ChatColor.RED + " is not online!");
    							    return false;
    							}
    						}
    					}
    				String reason = args[1];
    				
    					if(args.length == 2){
    					  if(args[1].equalsIgnoreCase(args[1])){
    						  if(reason == null){
    							  player.sendMessage(ChatColor.RED + "please provide a reason!");
    							  return false;
    						     }
    						  }
    					  
    					  
    						  if(targetplayer == null){
    							  player.sendMessage(ChatColor.RED + "The Player " + ChatColor.DARK_RED + args[0] + ChatColor.RED + " is not online!");
    							  return false;
    						  }
    						  
    						  if(targetplayer.isOnline()){
    							  targetplayer.sendMessage(player.getDisplayName() + ChatColor.GOLD + " warned you for " +
    						      ChatColor.RED + ChatColor.BOLD.toString() + args[1]);
    			    				reason.trim();
    						  }else{
    							  player.sendMessage(ChatColor.RED+"The Player" + ChatColor.DARK_RED + args[0] + ChatColor.RED + " is not online!");
    						  }
     					}
    			   	 }
    				}
    			return false;
    			}
    		}
