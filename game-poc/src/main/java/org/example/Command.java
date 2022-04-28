package org.example;

import lombok.Data;

@Data
public class Command<T> {

    private String name;

    private T[] targets;

    public Command(String name, T... targets) {
        this.name = name;
        this.targets = targets;
    }

}
