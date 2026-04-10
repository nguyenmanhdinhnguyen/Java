package the;

class EpicItem extends Item{
	public EpicItem(String name) {
		super(name,60);
	}
	
	public String getTier() {
		return "Epic";
	}
}
