package NewPackage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PriceList {
    ArrayList<Goods> goods;
    Category category;

    PriceList (ArrayList<Goods> m_goodss) {
        this.goods = m_goodss;
    }

    //sorting by price in ascending order
    public class PriceComparator implements Comparator<Goods> {

        @Override
        public int compare(Goods goods1, Goods goods2) {
            return goods1.getPrice() - goods2.getPrice();
        }

    }

    //sorting by weight in ascending order
    public static class WeightComparator implements Comparator<Goods> {

        @Override
        public int compare(Goods goods1, Goods goods2) {
            return goods1.getWeight() - goods2.getWeight();
        }

    }

    //sorting by price in descending order
    public void sortWithAnonClass(ArrayList<Goods> fishes)
    {
        Collections.sort(fishes, new Comparator<Goods>() {
            @Override
            public int compare(Goods goods1, Goods goods2) {
                return goods2.getPrice() - goods1.getPrice();

            }
        });
    }

    //sorting by weight in descending order
    public void sortWithLambda(ArrayList<Goods> fishes)
    {
        Collections.sort(fishes, (goods1, goods2) -> goods2.getWeight() - goods1.getWeight());
    }

    public void output(ArrayList<Goods> fishes)
    {
        for (int i = 0; i < fishes.size(); i++) {
            System.out.println(fishes.get(i).getName() + "\t\t" + fishes.get(i).getPrice() + "\t\t\t" + fishes.get(i).getWeight() + "\t");
        }
    }

    public void searchByName(String name, ArrayList<Goods> fishes, ArrayList<Goods> foundDishes ) {

        for (int i = 0; i < fishes.size(); i++)
        {
            if (fishes.get(i).getName().equals(name)) {
                foundDishes.add(fishes.get(i));
            }
        }

        if (foundDishes.size() > 0) {
            System.out.println("Found!:");
            for (int i = 0; i < foundDishes.size(); i++) {
                System.out.println(foundDishes.get(i).getName() + "\t\t"  + foundDishes.get(i).getPrice() + "\t\t\t" + foundDishes.get(i).getWeight() + "\t");
            }
        }
        else System.out.println("Matches are not found :(");
    }

}
