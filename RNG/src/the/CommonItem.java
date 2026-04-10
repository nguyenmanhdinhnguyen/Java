package the;

class CommonItem extends Item{
	public CommonItem(String name) {
		super(name,10);
	}
	
	public String getTier() {
		return "Common";
	}
}
