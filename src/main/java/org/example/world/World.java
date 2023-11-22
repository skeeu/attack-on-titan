package org.example.world;

import org.example.character.Player;
import org.example.titan.Titan;
import org.example.titan.factory.EasyTitanFactory;
import org.example.titan.factory.HardTitanFactory;
import org.example.titan.factory.MediumTitanFactory;
import org.example.titan.factory.TitanFactory;

import java.util.*;

public class World {
    private static World instance = null;

    private List<Player> players = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    private final Map<String, TitanFactory> difficulties = Map.ofEntries(
            new AbstractMap.SimpleEntry<>("easy", new EasyTitanFactory()),
            new AbstractMap.SimpleEntry<>("medium", new MediumTitanFactory()),
            new AbstractMap.SimpleEntry<>("hard", new HardTitanFactory())
    );    
    private String chosenDifficulty;

    private World(){}

    public static World getInstance() {
        if (instance == null) {
            instance = new World();
        }
        return instance;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void removePlayer(Player player) {
        this.players.remove(player);
    }

    private int getRandomDelay() {
        Random random = new Random();
        return random.nextInt(5000, 10000);
    }

    private void chooseDifficulty() {
        while (true) {
            System.out.println("Choose difficulty");
            for (Map.Entry<String, TitanFactory> entry : difficulties.entrySet()) {
                System.out.println(entry.getKey());
            }
            String difficulty = sc.next();
            if (difficulties.containsKey(difficulty)) {
                chosenDifficulty = difficulty;
                System.out.println("Success! Wait for titans to fight");
                break;
            } else {
                System.out.println("Chosen difficulty does not exists. Try another");
            }
        }
    }

    public void startGame() {
        chooseDifficulty();
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                int delay = getRandomDelay();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        players.forEach(player -> {
                            if (!player.isFighting()) {
                                player.challengeToFight(difficulties.get(chosenDifficulty).createTitan());
                            }
                        });
                    }
                }, delay);
            }
        };
        timer.scheduleAtFixedRate(task, 0, 10000);
    }
}
