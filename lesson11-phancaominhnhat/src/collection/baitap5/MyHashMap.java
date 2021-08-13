package collection.baitap5;

public class MyHashMap {
	
	private static final int SIZE = 16;
	private Entry[] table = new Entry[SIZE];
	
	public Entry get(String k) {
         int hash = k.hashCode() % SIZE;
         Entry e = table[hash];
        
         while(e != null) {
               if(e.getKey().equals(k)) {
                     return e;
               }
               e = e.next;
         }
         return null;
	}
	
	public Entry[] get() {
		
		return table;
	}
	
	public void put(String k, int v) {
        int hash = k.hashCode() % SIZE;
        Entry e = table[hash];

        if(e != null) {
              if(e.getKey().equals(k)) {
                    e.setValue(v);
              } else {
                    while(e.next != null) {
                          e = e.next;
                    }
                    Entry entryInOldBucket = new Entry(k, v);
                    e.next = entryInOldBucket;
              }
        } else {
              Entry entryInNewBucket = new Entry(k, v);
              table[hash] = entryInNewBucket;
        }
  }

	public Entry[] sortByKey(Entry[] table) {
		for(int i = 0; i < SIZE; i++) {
			
		}
		return null;
	}
}
