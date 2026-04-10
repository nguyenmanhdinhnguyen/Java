package the;

abstract class Item {
	protected String name;
	protected int value;
	
	public Item(String name, int value) {
		this.name = name;
		this.value = value;
	}
	
	public abstract String getTier();
	
	public int getValue() {
		return value;
	}
	
	 public String toString() {
	        return name + " [" + getTier() + "] (+" + value + "$)";
	    }
}
