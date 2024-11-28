package Interface_XII;
 import java.util.ArrayList;
public class Bag {
    public class Item{
        public String name;
        public int quantity;

        public Item(String name) {
            this.name = name;
            this.quantity = 1;
        }
    }
    private ArrayList<Item>items;

    public Bag() {
        items = new ArrayList<>();
    }
    public void add(String itemName){
        //int quantity = 0;
        for(Item item : items){
            if(item.name.equals(itemName)){
                item.quantity++;
                return;
            }
        }
        items.add(new Item(itemName));
    }
    public int count(String itemName){
        for(Item item : items){
            if(item.name.equals(itemName)){
                return item.quantity;
            }
        }
        return 0;
    }
}
