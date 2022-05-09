package org.example;

public abstract class DungeonFactory {

    public static Dungeon getDungeon(DungeonName dungeonName) {
        if (dungeonName.equals(DungeonName.RATS_CAVE)) {
            Event event1 = new FightableEvent(MonsterFactory.create(MonsterName.RAT));
            Event event2 = new FightableEvent(MonsterFactory.create(MonsterName.RAT));
            Event event3 = new FightableEvent(MonsterFactory.create(MonsterName.RAT));
            Dungeon dungeon = Dungeon.builder()
                    .dungeonName(dungeonName)
                    .build();
            dungeon.addEvent(event1);
            dungeon.addEvent(event2);
            dungeon.addEvent(event3);
            dungeon.activeNextEvent();
            return dungeon;
        }
        throw new RuntimeException("Dungeon not found");
    }

}
