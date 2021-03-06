package com.minetexas.nocollide;

//import org.bukkit.attribute.Attribute;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;

public class MobListener implements Listener {
	@EventHandler(priority = EventPriority.NORMAL)
	public void onCreatureSpawnEvent(CreatureSpawnEvent event) {
		if (event.getSpawnReason().equals(SpawnReason.SPAWNER) && event.getEntity() instanceof LivingEntity) {
			LivingEntity entity = event.getEntity();
			entity.setCollidable(false);
			return;
		}
	}
}
