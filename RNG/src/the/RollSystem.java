package the;
import java.util.Random;

class RollSystem {
    static Random rand = new Random();

    static String[] names = {"Sword", "Ring", "Orb", "Crown", "Blade"};

    public static Item roll(Player p) {
        double roll = rand.nextDouble() * 100 + p.luck;

        Item item;

        if (roll < 50) {
            item = new CommonItem(randomName());
        } else if (roll < 75) {
            item = new RareItem(randomName());
        } else if (roll < 90) {
            item = new EpicItem(randomName());
        } else if (roll < 98) {
            item = new LegendaryItem(randomName());
        } else {
            item = new MythicItem(randomName());
        }

        // Crit system
        if (rand.nextDouble() * 100 < p.critChance) {
            System.out.println("💥 CRITICAL!");
            int boosted = (int)(item.getValue() * p.critMultiplier);

            // overwrite value using anonymous subclass (advanced trick)
            item = new Item(item.name, boosted) {
                public String getTier() {
                    return item.getTier();
                }
            };
        }

        return item;
    }

    private static String randomName() {
        return names[rand.nextInt(names.length)];
    }
}