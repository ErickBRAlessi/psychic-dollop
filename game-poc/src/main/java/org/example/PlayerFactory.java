package org.example;

import java.util.*;

public abstract class PlayerFactory {

    public static Player createNewKnight(String name) {
        List<Equipment> equipmentList = new ArrayList<>();
        equipmentList.add(EquipmentFactory.createEquipment(EquipmentName.BRONZE_ARMOR));
        HashMap<Status, Long> statusHashMap = new HashMap<>();
        statusHashMap.put(Status.LIFE, 10L);
        statusHashMap.put(Status.ARMOR, 10L);
        statusHashMap.put(Status.MIGHT, 10L);
        return Player.builder()
                .id(UUID.randomUUID())
                .name(name)
                .hand(new ArrayList<>())
                .deck(new Stack<>())
                .equippedList(new HashMap<>())
                .cardList(new ArrayList<>())
                .equipmentList(equipmentList)
                .statusList(statusHashMap)
                .build();

    }
}
