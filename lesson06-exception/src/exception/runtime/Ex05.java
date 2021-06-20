package exception.runtime;

public class Ex05 {
	public static void main(String[] args) {
		Item[] items = new Item[2];
		for (int i = 0; i < items.length; i++) {
			if(items[i]==null) {
				//Sua loi, ko can try catch
				items[i]=new Item();
			}
			updateValue(items[i], i);
		}
		
		for(Item item: items) {
			System.out.println(item);
		}
	}

	private static void updateValue(Item item, int i) {
		item.setId(i);
		item.setName("Item -" + i);
	}
	
	//nested class
	
	//ở dòng 7 muốn dùng new Item() 
	//thì constructor của class Item phải là static 
	
	private static class Item {
		private int id;
		private String name;
		public Item() {
		}
		public void setId(int id) {
			this.id = id;
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
