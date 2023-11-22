package org.example.titan;

import org.example.character.GameCharacter;

public class HammerTitanAdapter extends Titan{
    private HammerTitan hammerTitan;

    public HammerTitanAdapter(int healthPoint, String name) {
        super(healthPoint, name);
        this.hammerTitan = new HammerTitan(healthPoint, name);
    }

    @Override
    public void attack(GameCharacter enemy) {
        super.attack(enemy);
        hammerTitan.hammerBlow();
    }
}
