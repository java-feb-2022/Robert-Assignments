import java.util.ArrayList;

class Test{
    public static void main(String[] args){
        // Creating Item Instances to use later
        Item item1 = new Item();
        item1.name = "mocha";
        item1.price = 1.50;
        Item item2 = new Item();
        item2.name = "latte";
        item2.price = 5.00;
        Item item3 = new Item();
        item3.name = "drip coffee";
        item3.price = 3.50;
        Item item4 = new Item();
        item4.name = "capuccino";
        item4.price = 3.75;

        Order order1 = new Order();
        order1.name = "Cindhuri";
        Order order2 = new Order();
        order2.name = "Jimmy";
        Order order3 = new Order();
        order3.name = "Noah";
        Order order4 = new Order();
        order4.name = "Sam";

        System.out.println(order1);
        System.out.println(order1.total);

        // Adding Items to orders ArrayList<Item>
        order2.addItem(item1);
        order3.addItem(item4);
        order4.addItem(item2);

        // Updating ready property in order
        order1.updateReady(true);

        order2.addItem(item2);
        order2.addItem(item2);

        order2.updateReady(true);
    }
}