public class DropListener implements Listener {
	
	public VividNetwork plugin;

	public DropListener(VividNetwork plugin){
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onPlayerDropItem(PlayerDropItemEvent event) {
		if(!event.getPlayer().hasPermission("dropprevent.allowdrop")) {event.setCancelled(true);}
	}
}
