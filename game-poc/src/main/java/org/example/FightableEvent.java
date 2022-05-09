package org.example;

import java.util.ArrayList;

public class FightableEvent extends Event {

    private Monster monster;

    public FightableEvent(Monster monster) {
        super(new ArrayList<>());
        this.monster = monster;
        super.options().add(new Command("ATTACK", monster));

    }
}
