package org.example;

import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class Person {

    private UUID id;

    private String name;

    private String email;

    private String passwordMD5;

    private List<Player> playerList;

}

