import java.util.ArrayList;

public class Order {
    private String name;
    private double total;
    private boolean ready;
    private ArrayList<Item> items;

    public Order(){
        name = "Guest";
        total = 0;
        ready = false;
        items = new ArrayList<>();
    }

    public Order(String _name){
        name = _name;
        total = 0;
        ready = false;
        items = new ArrayList<>();
    }

    public void display(){
        String printDisplay = String.format("Customer Name: %s\n", name);
        for(int i = 0; i < items.size(); i++){
            printDisplay+= items.get(i).getName() + " : $" + items.get(i).getPriceAsString() + "\n";
        }
        printDisplay+= "Total: $" + total;
        System.out.println(printDisplay);
    }

    public double getTotal(){
        return total;
    }

    public void addItem(Item item){
        items.add(item);
        total+= item.getPrice();
    }

    public void addItem(Item[] addItems){
        for(Item item : addItems){
            items.add(item);
            total += item.getPrice();
        }
    }

    public String getStatusMessage(){
        if(ready){
            return "Your order is ready.";
        }
        else{
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public boolean isReady(){
        return ready;
    }

    public void updateReady(boolean updateValue){
        ready = updateValue;
    }
}
