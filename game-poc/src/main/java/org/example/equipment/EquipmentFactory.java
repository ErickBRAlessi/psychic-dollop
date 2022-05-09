package org.example.equipment;

import org.example.Status;
import org.example.card.Card;
import org.example.card.CardFactory;
import org.example.card.CardName;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public abstract class EquipmentFactory {

    public static Equipment createEquipment(EquipmentName equipmentName) {
        if (equipmentName.equals(EquipmentName.BRONZE_ARMOR)) {
            List<Card> cardList = new ArrayList<>();
            cardList.add(CardFactory.create(CardName.MAGIC_HEAL));
            HashMap<Status, Long> statusBonus = new HashMap<>();
            statusBonus.put(Status.LIFE, 10L);
            statusBonus.put(Status.ARMOR, 5L);
            statusBonus.put(Status.MIGHT, 1L);
            statusBonus.put(Status.CURSE, 1L);
            return Equipment.builder()
                    .id(UUID.randomUUID())
                    .equipmentName(equipmentName)
                    .equipmentKind(EquipmentKind.ARMOR)
                    .cardList(cardList)
                    .statusBonus(statusBonus)
                    .build();
        }
        throw new RuntimeException("Equipment not found");
    }

}
