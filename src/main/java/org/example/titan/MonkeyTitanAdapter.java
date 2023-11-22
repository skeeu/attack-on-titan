package org.example.titan;

import org.example.character.GameCharacter;

public class MonkeyTitanAdapter extends Titan {
    private MonkeyTitan monkeyTitan;

    public MonkeyTitanAdapter(int healthPoint, String name) {
        super(healthPoint, name);
        this.monkeyTitan = new MonkeyTitan(healthPoint, name);
    }

    @Override
    public void attack(GameCharacter enemy) {
        super.attack(enemy);
        monkeyTitan.throwStones();
    }
}
