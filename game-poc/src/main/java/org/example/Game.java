package org.example;

import java.util.Arrays;
import java.util.Map;
import java.util.UUID;

public class Game {

    private UUID id;

    private Map<UUID, Player> playerMap;

    private Dungeon dungeon;

    public Game(Dungeon dungeon, Player... players) {
        id = UUID.randomUUID();
        Arrays.stream(players).forEach(player -> addPlayer(player));
    }

    public void processCommand(Command command) {

    }

    public UUID addPlayer(Player player) {
        UUID uuid = UUID.randomUUID();
        playerMap.put(uuid, player);
        return uuid;
    }

}
