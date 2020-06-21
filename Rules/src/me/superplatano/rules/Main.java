package me.superplatano.rules;

import org.bukkit.plugin.java.JavaPlugin;

import me.superplatano.rules.listeners.Listeners;

public class Main extends JavaPlugin{
	@Override
	public void onEnable() {
		new Listeners(this);
	}

}
