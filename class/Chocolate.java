class Chocolate {

    String brandName;
    int chocolateId;
    boolean isDarkChocolate;
    int weightInGrams;
    double price;

    public Chocolate(String c1, int c2, boolean c3, int c4, double c5) {
        brandName = c1;
        chocolateId = c2;
        isDarkChocolate = c3;
        weightInGrams = c4;
        price = c5;
    }

    public void display() {
        System.out.println(brandName);
        System.out.println(chocolateId);
        System.out.println(isDarkChocolate);
        System.out.println(weightInGrams);
        System.out.println(price);
    }
}