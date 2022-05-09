package org.example;

import lombok.Builder;
import lombok.Data;

import java.util.Map;
import java.util.UUID;

@Builder
@Data
public class Monster {

    private UUID id;

    private MonsterName name;

    private Map<Status, Long> statusList;


}
