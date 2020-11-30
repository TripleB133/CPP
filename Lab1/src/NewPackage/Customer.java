package NewPackage;

public class Customer {
    String name;
    int QueueID;

    Customer(String n, int rID) {
        this.name = n;
        this.QueueID = rID;
    }

    public String getName() {
        return name;
    }

    public int getQueueID() {
        return QueueID;
    }


}

