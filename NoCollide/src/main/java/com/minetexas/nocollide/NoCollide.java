package com.minetexas.nocollide;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class NoCollide extends JavaPlugin {
	@Override
	public void onEnable() {
		this.getLogger().info("Enabled");
		final PluginManager pluginManager = getServer().getPluginManager();
		pluginManager.registerEvents(new MobListener(), this);
	}
	@Override
	public void onDisable() {
		this.getLogger().info("Disable");
	}
}
