package org.example.card;

import lombok.Builder;
import lombok.Data;
import org.example.Effect;

import java.util.Map;
import java.util.UUID;

@Data
@Builder
public class Card {

    private UUID id;

    private CardName name;

    private Map<Effect, Long> effectList;

}
