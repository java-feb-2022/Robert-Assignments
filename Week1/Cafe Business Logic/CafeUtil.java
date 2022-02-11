import java.util.Arrays;
import java.beans.Customizer;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal(){
        int sum = 0;
        for(int i = 1; i <= 10; i++){
            sum += i;
        }
        return sum;
    }
    public int getStreakGoal(int numWeeks){
        int sum = 0;
        for(int i = 1; i <= numWeeks; i++){
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices){
        double total = 0;
        for(double price : prices){
            total += price;
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for(int i = 0; i < menuItems.size(); i++){
            System.out.printf("%s %s \n", i, menuItems.get(i));
        }
    }
    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices){
        boolean isValid = menuItems.size() == prices.size();
        if(isValid){
            DecimalFormat decimFormat = new DecimalFormat("0.00");
            for(int i = 0; i < menuItems.size(); i++){
                System.out.printf("%s %s -- %s\n", i, menuItems.get(i), decimFormat.format(prices.get(i)));
            }
        }
        return isValid;
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s!", userName);
        System.out.printf("There are %s people in front of you \n", customers.size());
        customers.add(userName);
        for(int i = 0; i < customers.size(); i++){
            System.out.printf("%s : %s \n", (i + 1), customers.get(i));
        }
    }

    public void printPriceChart(String product, double price, int maxQuantity){
        System.out.println(product);
        DecimalFormat decimFormat = new DecimalFormat("0.00");
        for(int i = 1; i <= maxQuantity; i++){
            System.out.printf("%s - $%s\n", i, decimFormat.format(price * i));
        }
    }
    public void printPriceChart(String product, double price, int maxQuantity, double quantityDiscount){
        System.out.println(product);
        DecimalFormat decimFormat = new DecimalFormat("0.00");
        for(int i = 1; i <= maxQuantity; i++){
            System.out.printf("%s - $%s\n", i, decimFormat.format((price * i) - (quantityDiscount * (i - 1))));
        }
    }
}
