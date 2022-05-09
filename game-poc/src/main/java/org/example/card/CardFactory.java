package org.example.card;

import org.example.Effect;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public abstract class CardFactory {

    public static Card create(CardName cardName) {
        if (cardName.equals(CardName.MAGIC_HEAL)) {
            Map<Effect, Long> effectLongMap = new HashMap<>();
            effectLongMap.put(Effect.HEAL, 10L);
            return Card.builder().id(UUID.randomUUID())
                    .name(cardName)
                    .effectList(effectLongMap)
                    .build();
        }
        throw new RuntimeException("Card not found");
    }
}
