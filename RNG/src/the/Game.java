package the;

import java.util.Scanner;

public class Game {
    static Scanner sc = new Scanner(System.in);
    static Player player = new Player();

    static int luckCost = 50;
    static int critCost = 75;

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== RNG GAME ===");
            System.out.println("Money: $" + player.money);
            System.out.println("Luck: " + player.luck + " | Crit: " + player.critChance + "%");

            System.out.println("1. Roll");
            System.out.println("2. Inventory");
            System.out.println("3. Shop");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> roll();
                case 2 -> player.showInventory();
                case 3 -> shop();
                case 4 -> { return; }
            }
        }
    }

    static void roll() {
        Item item = RollSystem.roll(player);
        player.addItem(item);
        System.out.println("You got: " + item);
    }

    static void shop() {
        System.out.println("1. Upgrade Luck ($" + luckCost + ")");
        System.out.println("2. Upgrade Crit ($" + critCost + ")");

        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                if (player.money >= luckCost) {
                    player.money -= luckCost;
                    player.luck += 2;
                    luckCost += 25;
                }
            }
            case 2 -> {
                if (player.money >= critCost) {
                    player.money -= critCost;
                    player.critChance += 2;
                    critCost += 40;
                }
            }
        }
    }
}
