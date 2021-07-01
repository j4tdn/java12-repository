package exception.compile;

public class Ex05 {
    public static void main(String[] args) {

        Item[] items = new Item[2]; // null null
        int[] x = new int[5]; // 0 0 0 0
         // set value
        // items[0] > null
        for(int i = 0; i < items.length; i++){
            if (items[i] == null){
                items[i] = new Item();
            }
            updateValue(items[i],i);
        }
        // printf
        for(Item item : items){
            System.out.println(item);
        }

    }
    private static void updateValue(Item item, int i)
    {
//        if (item == null){
//            item = new Item();
//        }
        item.setId(i); // NPE : RuntimeException
        item.setName("Item "+i);


    }
    // nested class
    private static class Item{
        private int id;
        private String name;

        public Item() {};
        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
