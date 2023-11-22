package org.example.character;

import org.example.inventory.Inventory;
import org.example.weapon.Weapon;

import java.util.Scanner;

public class Player extends GameCharacter {
    private int level;
    public Inventory inventory;
    private Weapon weapon;
    private boolean isFighting;
    private Scanner sc = new Scanner(System.in);

    public Player(int healthPoint, String name) {
        super(healthPoint, name);
        this.level = 1;
        this.inventory = new Inventory();
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void takeDamage(int damage) {}
    public void attack(GameCharacter enemy) {
        enemy.takeDamage(this.weapon.getAttackPoint());
        System.out.println("Attacked with " + this.weapon.getName() + " on damage: " + this.weapon.getAttackPoint());
    }

    public void challengeToFight(GameCharacter enemy) {
        isFighting = true;
        System.out.println("You`ve been challenged to fight against " + enemy.getName() + " with " + enemy.getHealthPoint() + "HP");
        System.out.println("1. Accept\n2. Decline");
        while (true) {
            int choice = sc.nextInt();
            if (choice == 2) {
                isFighting = false;
                System.out.println("Okay. Wait for another enemy");
                break;
            } else if (choice == 1) {
                fight(enemy);
                break;
            } else {
                System.out.println("There is no other variants");
            }
        }
    }

    private void fight(GameCharacter enemy) {
        while (true) {
            System.out.println("What to do? \n1. Attack");
            int choice = sc.nextInt();
            if (choice == 1) {
                attack(enemy);
                if (enemy.getHealthPoint() <= 0) {
                    System.out.println("You won! Wait for the next enemy");
                    isFighting = false;
                    break;
                } else {
                    System.out.println("Enemy have " + enemy.getHealthPoint() + " HP");
                }
            }
        }
    }

    public boolean isFighting() {
        return isFighting;
    }
}

