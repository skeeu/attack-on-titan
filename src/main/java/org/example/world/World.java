package org.example.world;

public class World {
    private World instance;
    private World(){}

    public World getInstance() {
        return instance;
    }
}
