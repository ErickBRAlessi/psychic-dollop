package org.example;

import java.util.Stack;

public class Dungeon {

    private Stack<Event> events = new Stack<>();

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
            return event;
        }
        return null;
    }
}
