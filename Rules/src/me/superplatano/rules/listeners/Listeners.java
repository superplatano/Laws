package me.superplatano.rules.listeners;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.superplatano.rules.Main;
import me.superplatano.rules.utils.Utils;

public class Listeners implements CommandExecutor{
	
	private Main plugin;
	
	public Listeners(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("laws").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender instanceof Player)) {
			sender.sendMessage("Not you ugly cmd");
			return true;
		}
		Player player = (Player) sender;
		if(player.hasPermission("laws.view")) {
			player.sendMessage(Utils.chat(plugin.getConfig().getString("header")));
			player.sendMessage(Utils.chat(plugin.getConfig().getString("rule1")));
			player.sendMessage(Utils.chat(plugin.getConfig().getString("rule2")));
			player.sendMessage(Utils.chat(plugin.getConfig().getString("rule3")));
			return true;
		} else {
			player.sendMessage("No permission. Contact the server administrators");
		}
		return false;
	}	
}
