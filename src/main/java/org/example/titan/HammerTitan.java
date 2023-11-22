package org.example.titan;

public class HammerTitan extends Titan{
    public HammerTitan(int healthPoint, String name) {
        super(healthPoint, name);
    }

    public void hammerBlow() {
        System.out.println("Hammer Titan hit with a hammer!!!");
    }
}
