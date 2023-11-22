package org.example.character;

public abstract class GameCharacter {
    private int healthPoint;
    private String name;

    public GameCharacter(int healthPoint, String name) {
        this.healthPoint = healthPoint;
        this.name = name;
    }

    public void takeDamage(int damage) {
        healthPoint -= damage;
    }
    public void attack(GameCharacter enemy) {
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }
}
