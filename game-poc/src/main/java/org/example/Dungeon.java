package org.example;

import lombok.Builder;
import lombok.Data;

import java.util.Stack;

@Builder
@Data
public class Dungeon {

    private final Stack<Event> events = new Stack<>();

    private DungeonName dungeonName;

    private Event activeEvent;

    public void addEvent(Event event) {
        events.push(event);
    }

    public Event getActiveEvent() {
        return activeEvent;
    }

    public Event activeNextEvent() {
        if (events.size() > 0) {
            Event event = events.peek();
            events.pop();
            this.activeEvent = event;
            return activeEvent;
        }
        return null;
    }
}
