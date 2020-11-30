package NewPackage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Goods {
    private String name;
    private int price;
    private int weight;

    Goods ( String c_name, int c_price, int c_weight) {
        this.name = c_name;
        this.price = c_price;
        this.weight = c_weight;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }}


