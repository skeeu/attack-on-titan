package org.example.weapon;

import org.example.GameItem;

public abstract class Weapon extends GameItem {
    private int attackPoints;
    public abstract void attack();
}

