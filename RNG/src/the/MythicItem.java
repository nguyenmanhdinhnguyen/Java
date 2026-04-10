package the;

class MythicItem extends Item{
	public MythicItem(String name) {
		super(name,400);
	}
	
	public String getTier() {
		return "Mythic";
	}
}
