package collection.baitap5;


public class App {
	public static MyHashMap myHashMap = new MyHashMap();
	public static void main(String[] args) {

        myHashMap.put("Breakfast", 1000000);
        myHashMap.put("Dinner", 600000);
        myHashMap.put("Lunch", 30000);
        
        lietKeChiTieuLonHonNamTram();
        
	}
	
	public static void lietKeChiTieuLonHonNamTram() {
		for(Entry e : myHashMap.get()) {
       	 if(e != null && e.getValue() > 500000) {
       		 System.out.println(e);
       	 }
        }
	}
	
	public static MyHashMap sapXepTheoKey() {
		return null;
	}
}
