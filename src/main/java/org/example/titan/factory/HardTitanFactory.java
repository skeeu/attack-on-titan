package org.example.titan.factory;
import java.util.Random;
import org.example.titan.Titan;
public class HardTitanFactory extends TitanFactory {
    @Override
    public Titan createTitan() {
        Random random = new Random();
        int healthPoint = random.nextInt(5000 - 3000 + 1) + 3000;
        return new Titan(healthPoint, "Medium Titan");
    }
}
