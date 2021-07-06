package exception.runtime;

public class Ex05 {
	public static void main(String[] args) {
		Item[] items = new Item[2];
		
		//set value
		for(int i = 0; i < items.length; i++) {
			if(items[i] == null) {
				items[i] = new Item();
			}
			updateValue(items[i], i);
		}
		
		//print value 
		for (Item item : items) {
			System.out.println(item);
		}
	}
	
	private static void updateValue(Item item, int i) {
		if(item == null) {
			item = new Item();
		}
		
		item.setId(9);
		item.setName("Item" + i);
	}

	private static class Item {
		private int id;
		private String name;
		
		public Item() {
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Item [id=" + id + ", name=" + name + "]";
		}
		
	}
}
