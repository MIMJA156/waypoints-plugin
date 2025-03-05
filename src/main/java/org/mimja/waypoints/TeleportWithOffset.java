package org.mimja.waypoints;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;

import java.util.Random;

public class TeleportWithOffset {
    private static final Random RANDOM = new Random();

    private static Location getRandomLocation(Location location) {
        int offsetX = RANDOM.nextInt(3) - 1;
        int offsetZ = RANDOM.nextInt(3) - 1;

        while (offsetX == 0 && offsetZ == 0) {
            offsetX = RANDOM.nextInt(3) - 1;
            offsetZ = RANDOM.nextInt(3) - 1;
        }

        return new Location(
                location.getWorld(),
                location.getX() + offsetX + 0.5f,
                location.getY(),
                location.getZ() + offsetZ + 0.5f
        );
    }

    public static void teleportWithRandomOffset(Player player, Location destination) {
        Location loc = getRandomLocation(destination);
        int limit = 50;
        while (limit > 0 && (loc.getBlock().getType() != Material.AIR || loc.add(0, 1, 0).getBlock().getType() != Material.AIR)) {
            loc = getRandomLocation(loc);
            limit -= 1;
        }
        player.teleport(loc);
    }
}