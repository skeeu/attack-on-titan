package org.example;

import org.example.weapon.MagicalWeapon;

public class Main {
    public static void main(String[] args) {
        Player p = Player.getInstance();
        MagicalWeapon mw = new MagicalWeapon();
        p.inventory.addItem(mw);
        p.inventory.showItems();
        p.inventory.removeItem();
    }
}