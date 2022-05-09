package org.example.equipment;

import lombok.Builder;
import lombok.Data;
import org.example.Status;
import org.example.card.Card;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Data
@Builder
public class Equipment {

    private UUID id;

    private EquipmentName equipmentName;

    private EquipmentKind equipmentKind;

    private HashMap<Status, Long> statusBonus;

    private List<Card> cardList;
}
