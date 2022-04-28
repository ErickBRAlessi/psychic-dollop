package org.example;

import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.UUID;

@Data
@Builder
public class Player {

    private UUID id;

    private String name;

    private List<Card> cardList;

    private Stack<Card> deck;

    private List<Card> hand;

    private Map<Status, Long> statusList;

    private List<Equipment> equipmentList;

    private Map<EquipmentKind, Equipment> equippedList;

    public Map<EquipmentKind, Equipment> equip(Equipment equipment) {
        equippedList.put(equipment.getEquipmentKind(), equipment);
        equipment.getCardList().stream().forEach(c -> cardList.add(c));
        equipment.getStatusBonus().forEach((status, value) -> addStatus(status, value));
        return equippedList;
    }

    public void addStatus(Status status, Long modifier) {
        Long oldModifier = statusList.get(status);
        if (oldModifier != null) {
            statusList.replace(status, oldModifier + modifier);
        } else {
            statusList.put(status, modifier);
        }
    }

}
