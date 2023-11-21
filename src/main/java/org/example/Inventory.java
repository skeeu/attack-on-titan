package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventory {
    private int capacity;
    private List<GameItem> items = new ArrayList<>();
    private Scanner sc;

    public Inventory() {
        this.sc = new Scanner(System.in);
        this.capacity = 10;
    }

    public void addItem(GameItem item) {
        if (this.items.size() < this.capacity) {
            items.add(item);
            System.out.println("You`ve added " + item.name + " item to inventory");
        } else {
            System.out.println("Your inventory is full: " + this.capacity + "/" + this.capacity + " slots occupied");
        }
    }

    public void showItems() {
        for(int i = 0; i < this.items.size(); i++) {
            System.out.println(i + 1 + ". " + items.get(i).name);
        }
    }

    public void removeItem() {
        while (true) {
            System.out.println("Which item you want to remove?");
            this.showItems();
            System.out.println(0 + ". Leave");
            int itemIndex = this.sc.nextInt();
            if (itemIndex == 0) {
                break;
            }
            if (itemIndex < 0 || itemIndex > this.items.size()) {
                System.out.println("Incorrent item");
                continue;
            }
            System.out.println("You`ve removed " + this.items.get(itemIndex - 1).name + " from inventory");
            this.items.remove(itemIndex - 1);
            break;
        }
    }
}
