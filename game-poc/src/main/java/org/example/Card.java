package org.example;

import lombok.Builder;
import lombok.Data;

import java.util.Map;
import java.util.UUID;

@Data
@Builder
public class Card {

    private UUID id;

    private CardName name;

    private Map<Effect, Long> effectList;

}
