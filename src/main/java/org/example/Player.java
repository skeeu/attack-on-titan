package org.example;

import org.example.weapon.Weapon;


public class Player {
    private static Player instance;
    private int healthPoints;
    private int level;
    private Weapon weapon;
//    private Shield shield;
    public Inventory inventory;

    private static int defaultDamage = 10;
    private static int defaultShield = 10;

    private Player() {
        this.level = 1;
        this.inventory = new Inventory();
    }

    public static Player getInstance() {
        if (instance == null) {
            instance = new Player();
        }
        return instance;
    }

    public void levelUp() {
        this.level++;
        notifyObservers();
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

//    public void setShield(Shield shield) {
//        this.shield = shield;
//    }

    public void attack() {
        // Логика атаки с использованием оружия.
        if (weapon != null) {
            weapon.attack();
        } else {
            // Логика атаки без оружия (по умолчанию).
//            titan.receiveDamage(10); // Примерный урон без оружия.
        }
    }

    // Дополнительные методы класса Player.

    private void notifyObservers() {
//        playerObserver.update(this);
    }
}

