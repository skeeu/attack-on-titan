package org.example.weapon;

import org.example.character.GameCharacter;
import org.example.inventory.GameItem;

public class Weapon extends GameItem {
    private int attackPoint;

    public Weapon(String name, int attackPoint) {
        super(name);
        this.attackPoint = attackPoint;
    }

    public int getAttackPoint() {
        return attackPoint;
    }
}