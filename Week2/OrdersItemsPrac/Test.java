import java.util.ArrayList;

class Test{
    public static void main(String[] args){
        // Creating Item Instances to use later
        Item item1 = new Item("mocha", 1.50);
        Item item2 = new Item("latte", 5.00);
        Item item3 = new Item("drip coffee", 3.50);
        Item item4 = new Item("capuccino", 3.75);

        Order order1 = new Order("Cindhuri");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");

        System.out.println(order1);
        System.out.println(order1.getTotal());

        // Adding Items to orders ArrayList<Item>
        order2.addItem(item1);
        order3.addItem(item4);
        order4.addItem(item2);

        // Updating ready property in order
        order1.updateReady(true);

        order2.addItem(item2);
        order2.addItem(item2);

        order2.updateReady(true);
        order2.display();
    }
}