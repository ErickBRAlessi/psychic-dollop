package org.example;

import java.util.HashMap;
import java.util.UUID;

public abstract class MonsterFactory {

    public static Monster create(MonsterName name) {
        HashMap<Status, Long> statusHashMap = new HashMap<>();
        statusHashMap.put(Status.LIFE, 2L);
        statusHashMap.put(Status.ARMOR, 1L);
        statusHashMap.put(Status.MIGHT, 1L);
        return Monster.builder()
                .id(UUID.randomUUID())
                .name(name)
                .statusList(statusHashMap)
                .build();

    }
}
