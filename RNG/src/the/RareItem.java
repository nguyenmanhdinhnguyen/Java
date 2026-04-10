package the;

class RareItem extends Item{
	public RareItem(String name) {
		super(name,25);
	}
	
	public String getTier() {
		return "Rare";
	}
}
