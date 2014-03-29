import net.vividnetwork.Commands.HReloadCommand;
import net.vividnetwork.Listeners.DoubleJumpListener;
import net.vividnetwork.Listeners.DropListener;
import net.vividnetwork.Listeners.JoinLeaveListener;
import net.vividnetwork.Listeners.VanishTorchListener;

import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class VividNetwork extends JavaPlugin{

		@Override
		public void onEnable() {
			//Listeners			
			getServer().getPluginManager().registerEvents(new JoinLeaveListener(this), this);
			getServer().getPluginManager().registerEvents(new DropListener(this), this);
			getServer().getPluginManager().registerEvents(new DoubleJumpListener(this), this);
			getServer().getPluginManager().registerEvents(new VanishTorchListener(this), this);
			//Commands
			getCommand("hreload").setExecutor(new HReloadCommand(this));
			PluginDescriptionFile pdfFile = this.getDescription();
			System.out.println("[VividNetwork] "+pdfFile.getVersion()+" is Enabled!");
			saveConfig();
		}
		

		@Override
		public void onDisable(){
			PluginDescriptionFile pdfFile = this.getDescription();
			System.out.println("[VividNetwork] "+pdfFile.getVersion()+" is Disabled!");
			saveConfig();
		}
}
