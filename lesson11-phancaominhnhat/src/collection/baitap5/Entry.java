package collection.baitap5;

public class Entry {
	final String key;
    int value;
    Entry next;
 
    Entry(String k, int v) {
        key = k;
        value = v;
    }
 
    public int getValue() {
        return value;
    }
 
    public void setValue(int value) {
        this.value = value;
    }
 
    public String getKey() {
        return key;
    }
    @Override
    public String toString() {
    	return getKey() + " : " + getValue();
    }
}
