package the;
import java.util.ArrayList;
class Player {
	int money = 100;
	double luck = 0;
	double critChance = 5;
	double critMultiplier = 2;
	
	ArraryList<Item> inventory = new ArrayList<>();
	
	public void addItem(Item item) {
		inventory.add(item);
		money += item.getValue();
	}
	
	public void showInventory() {
		if(inventory.isEmpty()) {
			System.out.println("Inventory is empty!");
			return;
		}
		
		int total = 0;
		for (Item item : inventory) {
			System.out.println(item);
			total += item.getValue();
		}
		
		System.out.println("Total value: $" + total);
	}
}
