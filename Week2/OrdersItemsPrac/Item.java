import java.lang.reflect.Constructor;
import java.text.DecimalFormat;
import java.util.ResourceBundle.Control;

public class Item {
    private String name;
    private double price;

    private DecimalFormat moneyFormat = new DecimalFormat("0.00");

    public Item(String _name, double _price){
        name = _name;
        price = _price;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public String getPriceAsString(){
        return moneyFormat.format(price);
    }
}
