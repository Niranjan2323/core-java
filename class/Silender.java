class Silender {

    String customerName;
    int cylinderId;
    boolean isRefilled;
    double weight;
    double price;

    public Silender(String s1, int s2, boolean s3, double s4, double s5) {
        customerName = s1;
        cylinderId = s2;
        isRefilled = s3;
        weight = s4;
        price = s5;
    }

    
    public void display() {
        System.out.println(customerName);
        System.out.println(cylinderId);
        System.out.println(isRefilled);
        System.out.println(weight);
        System.out.println(price);
    }
}