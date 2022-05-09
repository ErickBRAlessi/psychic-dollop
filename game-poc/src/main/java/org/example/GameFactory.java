package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public abstract class GameFactory {

    public static Game getGame(Dungeon dungeon, Player... players) {
        Map<UUID, Player> playersMap = new HashMap<>();
        Arrays.stream(players).forEach(p -> playersMap.put(p.getId(), p));
        return Game.builder()
                .id(UUID.randomUUID())
                .dungeon(dungeon)
                .playerMap(playersMap)
                .build();
    }

    public static Game getGame(DungeonName dungeonName, Player... players) {
        Map<UUID, Player> playersMap = new HashMap<>();
        Arrays.stream(players).forEach(p -> playersMap.put(p.getId(), p));
        return Game.builder()
                .id(UUID.randomUUID())
                .dungeon(DungeonFactory.getDungeon(dungeonName))
                .playerMap(playersMap)
                .build();
    }

}
