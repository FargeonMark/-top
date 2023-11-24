package acutaltop.acutaltop;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public final class AcutalTop extends JavaPlugin {



    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("top")) {
            Player traget = (Player) sender;
            if (traget.getVelocity().getY() == -0.0784000015258789) {
                World world = Bukkit.getWorlds().get(0);
                world.setSpawnLocation(144, 22, -1227);
                traget.teleport(new Location(traget.getWorld(), 144, 22, -1227));
                world.getWorldBorder().setCenter(177, -1261);
                getServer().broadcastMessage(ChatColor.GREEN + "Your up now");
            } else {
                traget.sendMessage(ChatColor.RED + "This command cannot be used while having vertical velocity :P");
            }
        }

        return true;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
