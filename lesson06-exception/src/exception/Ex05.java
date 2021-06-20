package exception;

public class Ex05 {

	public static void main(String[] args) {
		Item[] items=new Item[2];
        for(int i=0;i<items.length;i++) {
        	if(items[i]==null)items[i]=new Item();
        	updateValues(items[i],i);
        }
        for(Item item:items) {
        	System.out.println(item);
        }
	}
	private static void updateValues(Item item,int i) {
		
		item.setId(i);
		item.setName("Item-"+i);
	}
	private static class Item{
		private int id;
		private String name;
		public Item() {
			
		}
		public Item(int id,String name) {
			this.id=id;
			this.name=name;
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
