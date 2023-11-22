package org.example.titan;

public class MonkeyTitan extends Titan{
    public MonkeyTitan(int healthPoint, String name) {
        super(healthPoint, name);
    }

    public void throwStones() {
        System.out.println("Monkey Titan thrown bunch of stones!!!");
    }
}
