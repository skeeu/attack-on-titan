package org.example;


import org.example.character.Player;
import org.example.weapon.concrete.Sword;
import org.example.weapon.decorator.FireWeaponDecorator;
import org.example.weapon.decorator.PoisonWeaponDecorator;
import org.example.world.World;

public class Main {
    public static void main(String[] args) {
        Player p = new Player(100, "Player1");

        Sword sword = new Sword("Swordik", 1000000);
        PoisonWeaponDecorator poison = new PoisonWeaponDecorator("Poison", 50, sword);
        FireWeaponDecorator fire = new FireWeaponDecorator("Fire force", 50, poison);

        p.setWeapon(fire);

        World world = World.getInstance();
        world.addPlayer(p);
        world.startGame();
    }
}