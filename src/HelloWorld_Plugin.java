/**
 * Created by Admin on 12.05.2015.
 */

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class HelloWorld_Plugin extends JavaPlugin {
    public static Logger log = Logger.getLogger("Minecraft");

    public void onLoad() {
        log.info("[HelloWorld_Plugin] Loaded...");
    }

    public void onEnable() {
        log.info("[HelloWorld_Plugin] Starting up...");
    }

    public void onDisable() {
        log.info("[HelloWorld_Plugin] Stopping...");
    }





}
