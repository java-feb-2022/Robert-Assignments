import java.util.ArrayList;

public class Order {
    String name;
    double total;
    boolean ready;
    ArrayList<Item> items;

    public void addItem(Item item){
        items.add(item);
        total+= item.price;
    }

    public void addItem(Item[] addItems){
        for(Item item : addItems){
            items.add(item);
        }
    }

    public void updateReady(boolean updateValue){
        ready = updateValue;
    }
}
