package org.example.weapon.decorator;

import org.example.weapon.Weapon;

public class WeaponDecorator extends Weapon {
    protected Weapon weapon;
    public WeaponDecorator(String name, int attackPoint, Weapon weapon) {
        super(name, attackPoint);
        this.weapon = weapon;
    }
}
