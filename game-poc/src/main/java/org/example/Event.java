package org.example;

import java.util.List;

public abstract class Event {

    private List<Command> commands;

    public Event(List<Command> commands) {
        this.commands = commands;
    }

    public List<Command> options() {
        return commands;
    }

}
