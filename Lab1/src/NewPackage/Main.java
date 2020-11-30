package NewPackage;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Greetings!Nice to see you in our shop! " +
                "\nHow can we call you?");
        Scanner in = new Scanner(System.in);
        String customerName = in.nextLine();

        Customer customer = new Customer(customerName, 1);

        System.out.println("Thanks, " + customer.name + "! Would you like to watch our goods? (1 - yes, 0 - no)");

        int choise = in.nextInt();
        if (choise == 1) {
            System.out.println("1 - live fish, " +
                    "\n2 - freezed fish," +
                    "\n3 - live fish with price between 50 and 100," +
                    "\n4 - freezed fish with price between 40 and 60");

            int menuCategory = in.nextInt();
            switch (menuCategory) {
                case 1 : {
                    ArrayList<Goods> commonFishes = new ArrayList<Goods>();
                    PriceList commonPriceList = new PriceList(commonFishes);
                    commonPriceList.category = Category.ALIVE;

                    commonFishes.add(new Goods("Herring",  55, 400));
                    commonFishes.add(new Goods("Carp",  100, 1000));
                    commonFishes.add(new Goods("Herring",  45, 320));
                    commonFishes.add(new Goods("Tuna",  110, 280));
                    commonFishes.add(new Goods("Tuna",  140, 400));
                    commonFishes.add(new Goods("Carp",  80, 800));
                    commonFishes.add(new Goods("Tuna",  90, 200));
                    commonFishes.add(new Goods("Salmon",  120, 270));
                    commonFishes.add(new Goods("Salmon",  100, 200));

                    System.out.println("Your list:\n" +
                            "NAME\t\tPRICE\t\tWEIGHT\t");

                    commonPriceList.output(commonFishes);

                    System.out.println("\nPlease, write a name of the fish, which you want to find:");
                    Scanner in1 = new Scanner(System.in);
                    String searchName = in1.nextLine();

                    ArrayList<Goods> foundFishes = new ArrayList<Goods>();
                    commonPriceList.searchByName(searchName, commonFishes, foundFishes);

                    System.out.println("\nThanks for watching! Also you can:" +
                            "\n1 - Sort by price in ascending order" +
                            "\n2 - Sort by price in descending order" +
                            "\n3 - Sort by weight in ascending order" +
                            "\n4 - Sort by weight in descending order");

                    int PriceListSortType = in.nextInt();
                    switch (PriceListSortType) {
                        case 1 : {
                            PriceList.PriceComparator priceComparator = commonPriceList.new PriceComparator();
                            Collections.sort(foundFishes, priceComparator);
                            commonPriceList.output(foundFishes);
                            break;
                        }
                        case 2 : {
                            commonPriceList.sortWithAnonClass(foundFishes);
                            commonPriceList.output(foundFishes);
                            break;
                        }
                        case 3 : {
                            PriceList.WeightComparator weightComparator = new PriceList.WeightComparator();
                            Collections.sort(foundFishes, weightComparator);
                            commonPriceList.output(foundFishes);
                            break;
                        }
                        case 4 : {
                            commonPriceList.sortWithLambda(foundFishes);
                            commonPriceList.output(foundFishes);
                            break;
                        }
                    }
                    break;
                }
                case 2 : {
                    ArrayList<Goods> freezedFishes = new ArrayList<Goods>();
                    PriceList freezedPriceList = new PriceList(freezedFishes);
                    freezedPriceList.category = Category.FREEZED;

                    freezedFishes.add(new Goods("Pollock",  70, 250));
                    freezedFishes.add(new Goods("Sockeye salmon",  80, 230));
                    freezedFishes.add(new Goods("Sockeye salmon",  90, 270));
                    freezedFishes.add(new Goods("Swordfish",  90, 260));
                    freezedFishes.add(new Goods("Swordfish",  70, 220));
                    freezedFishes.add(new Goods("Tilapia",  60, 200));
                    freezedFishes.add(new Goods("Tilapia",  100, 260));
                    freezedFishes.add(new Goods("Catfish",  95, 240));
                    freezedFishes.add(new Goods("Catfish",  40, 180));

                    System.out.println("Your list:\n" +
                            "NAME\t\tPRICE\t\tWEIGHT\t");

                    freezedPriceList.output(freezedFishes);

                    System.out.println("\nPlease, write a name of the fish, which you want to find:");
                    Scanner in1 = new Scanner(System.in);
                    String searchName = in1.nextLine();

                    ArrayList<Goods> foundFishes = new ArrayList<Goods>();
                    freezedPriceList.searchByName(searchName, freezedFishes, foundFishes);

                    System.out.println("\nThanks for watching! Also you can:" +
                            "\n1 - Sort by price in ascending order" +
                            "\n2 - Sort by price in descending order" +
                            "\n3 - Sort by weight in ascending order" +
                            "\n4 - Sort by weight in descending order");
                    int frezPriceListSortType = in.nextInt();
                    switch (frezPriceListSortType) {
                        case 1 : {
                            PriceList.PriceComparator priceComparator = freezedPriceList.new PriceComparator();
                            Collections.sort(foundFishes, priceComparator);
                            freezedPriceList.output(foundFishes);
                            break;
                        }
                        case 2 : {
                            freezedPriceList.sortWithAnonClass(foundFishes);
                            freezedPriceList.output(foundFishes);
                            break;
                        }
                        case 3 : {
                            PriceList.WeightComparator weightComparator = new PriceList.WeightComparator();
                            Collections.sort(foundFishes, weightComparator);
                            freezedPriceList.output(foundFishes);
                            break;
                        }
                        case 4 : {
                            freezedPriceList.sortWithLambda(foundFishes);
                            freezedPriceList.output(foundFishes);
                            break;
                        }
                    }
                    break;
                }
                case 3 : {
                    ArrayList<Goods> Price50to100Fishes = new ArrayList<Goods>();
                    PriceList Price50to100PriceList = new PriceList(Price50to100Fishes);
                    Price50to100PriceList.category = Category.AlivePrice50to100;

                    Price50to100Fishes.add(new Goods("Tuna",  70, 400));
                    Price50to100Fishes.add(new Goods("Salmon",  100, 370));
                    Price50to100Fishes.add(new Goods("Carp",  80, 410));
                    Price50to100Fishes.add(new Goods("Herring",  90, 250));
                    Price50to100Fishes.add(new Goods("Swordfish",  50, 390));
                    Price50to100Fishes.add(new Goods("Catfish",  90, 300));
                    Price50to100Fishes.add(new Goods("Tilapia",  50, 250));
                    Price50to100Fishes.add(new Goods("Tuna",  70, 300));
                    Price50to100Fishes.add(new Goods("Herring",  70, 270));

                    System.out.println("Your list:\n" +
                            "NAME\t\tPRICE\t\tWEIGHT\t");

                    Price50to100PriceList.output(Price50to100Fishes);

                    System.out.println("\nPlease, write a name of the fish, which you want to find:");
                    Scanner in1 = new Scanner(System.in);
                    String searchName = in1.nextLine();

                    ArrayList<Goods> foundFishes = new ArrayList<Goods>();
                    Price50to100PriceList.searchByName(searchName, Price50to100Fishes, foundFishes);

                    System.out.println("\nThanks for watching! Also you can:" +
                            "\n1 - Sort by price in ascending order" +
                            "\n2 - Sort by price in descending order" +
                            "\n3 - Sort by weight in ascending order" +
                            "\n4 - Sort by weight in descending order");

                    int Price50to100PriceListSortType = in.nextInt();

                    switch (Price50to100PriceListSortType) {
                        case 1 : {
                            PriceList.PriceComparator priceComparator = Price50to100PriceList.new PriceComparator();
                            Collections.sort(foundFishes, priceComparator);
                            Price50to100PriceList.output(foundFishes);
                            break;
                        }
                        case 2 : {
                            Price50to100PriceList.sortWithAnonClass(foundFishes);
                            Price50to100PriceList.output(foundFishes);
                            break;
                        }
                        case 3 : {
                            PriceList.WeightComparator weightComparator = new PriceList.WeightComparator();
                            Collections.sort(foundFishes, weightComparator);
                            Price50to100PriceList.output(foundFishes);
                            break;
                        }
                        case 4 : {
                            Price50to100PriceList.sortWithLambda(foundFishes);
                            Price50to100PriceList.output(foundFishes);
                            break;
                        }
                    }
                    break;
                }
                case 4 : {
                    ArrayList<Goods> Price40to60Fishes = new ArrayList<Goods>();
                    PriceList Price40to60PriceList = new PriceList(Price40to60Fishes);
                    Price40to60PriceList.category = Category.FREEZEDPrice40to60;

                    Price40to60Fishes.add(new Goods("Tilapia",  40, 50));
                    Price40to60Fishes.add(new Goods("Sawfish",  60, 150));
                    Price40to60Fishes.add(new Goods("Herring",  45, 150));
                    Price40to60Fishes.add(new Goods("Salmon",  50, 500));
                    Price40to60Fishes.add(new Goods("Salmon",  45, 550));
                    Price40to60Fishes.add(new Goods("Tuna",  42, 500));
                    Price40to60Fishes.add(new Goods("Tima",  47, 450));
                    Price40to60Fishes.add(new Goods("Carp",  50, 450));
                    Price40to60Fishes.add(new Goods("Herring",  45, 600));

                    System.out.println("Your list:\n" +
                            "NAME\t\tPRICE\t\tWEIGHT\t");

                    Price40to60PriceList.output(Price40to60Fishes);

                    System.out.println("\nPlease, write a name of the fish, which you want to find:");
                    Scanner in1 = new Scanner(System.in);
                    String searchName = in1.nextLine();

                    ArrayList<Goods> foundFishes = new ArrayList<Goods>();
                    Price40to60PriceList.searchByName(searchName, Price40to60Fishes, foundFishes);

                    System.out.println("\nThanks for watching! Also you can:" +
                            "\n1 - Sort by price in ascending order" +
                            "\n2 - Sort by price in descending order" +
                            "\n3 - Sort by weight in ascending order" +
                            "\n4 - Sort by weight in descending order");

                    int Price40to60PriceListSortType = in.nextInt();

                    switch (Price40to60PriceListSortType) {
                        case 1 : {
                            PriceList.PriceComparator priceComparator = Price40to60PriceList.new PriceComparator();
                            Collections.sort(foundFishes, priceComparator);
                            Price40to60PriceList.output(foundFishes);
                            break;
                        }
                        case 2 : {
                            Price40to60PriceList.sortWithAnonClass(foundFishes);
                            Price40to60PriceList.output(foundFishes);
                            break;
                        }
                        case 3 : {
                            PriceList.WeightComparator weightComparator = new PriceList.WeightComparator();
                            Collections.sort(foundFishes, weightComparator);
                            Price40to60PriceList.output(foundFishes);
                            break;
                        }
                        case 4 : {
                            Price40to60PriceList.sortWithLambda(foundFishes);
                            Price40to60PriceList.output(foundFishes);
                            break;
                        }
                    }
                    break;
                }
            }
        } else if (choise == 0){
            System.out.println("Hmmmm,  maybe next time!");
        } else {
            System.out.println("Ohh, wrong input! Please, choose 1 ( to watch list) or 0 (not to)");
        }
    }
}
