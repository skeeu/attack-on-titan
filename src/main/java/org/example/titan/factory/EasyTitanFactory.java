package org.example.titan.factory;

import java.util.Random;
import org.example.titan.Titan;
public class EasyTitanFactory extends TitanFactory {
    @Override
    public Titan createTitan() {
        Random random = new Random();
        int healthPoint = random.nextInt(2000 - 1000 + 1) + 1000;
        return new Titan(healthPoint, "Easy Titan");
    }
}
