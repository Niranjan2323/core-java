class Gift {

    String giftName;
    int giftId;
    boolean isWrapped;
    int quantity;
    double price;

    public Gift(String g1, int g2, boolean g3, int g4, double g5) {
        giftName = g1;
        giftId = g2;
        isWrapped = g3;
        quantity = g4;
        price = g5;
    }

    public void display() {
        System.out.println(giftName);
        System.out.println(giftId);
        System.out.println(isWrapped);
        System.out.println(quantity);
        System.out.println(price);
    }
}