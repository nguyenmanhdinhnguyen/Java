package the;

class LegendaryItem extends Item{
	public LegendaryItem(String name) {
		super(name,150);
	}
	
	public String getTier() {
		return "Legendary";
	}
}
