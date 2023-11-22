package org.example.weapon.decorator;

import org.example.weapon.Weapon;

public class FireWeaponDecorator extends WeaponDecorator {
    public FireWeaponDecorator(String name, int attackPoint, Weapon weapon) {
        super(name, attackPoint, weapon);
    }

    @Override
    public int getAttackPoint() {
        return weapon.getAttackPoint() + super.getAttackPoint();
    }

    @Override
    public String getName() {
        return weapon.getName() + " with " + super.getName();
    }
}
