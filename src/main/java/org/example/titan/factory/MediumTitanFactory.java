package org.example.titan.factory;

import java.util.Random;
import org.example.titan.Titan;
public class MediumTitanFactory extends TitanFactory {
    @Override
    public Titan createTitan() {
        Random random = new Random();
        int healthPoint = random.nextInt(10000 - 6000 + 1) + 6000;
        return new Titan(healthPoint, "Hard Titan");
    }
}
