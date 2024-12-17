package pl.nadwey.nadwejowapomoc;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityChangeBlockEvent;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Notatki:
 * <ul>
 * <li>W idealnym świecie handler powinien być w osobnej klasie ale to jest tylko taki se przykład</li>
 * </ul>
 */
public final class NadwejowaPomoc extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onEntityChangeBlock(EntityChangeBlockEvent event) {
        if (event.getBlock().getType() == Material.FARMLAND) {
            event.setCancelled(true);
        }

        if (event.getEntity() instanceof Player player) {
            player.sendMessage("Nie możesz1!1!");
        }
    }

}
