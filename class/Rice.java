class Rice {

    String riceType;
    int riceId;
    boolean isPremiumQuality;
    int weightInKg;
    double price;

    public Rice(String r1, int r2, boolean r3, int r4, double r5) {
        riceType = r1;
        riceId = r2;
        isPremiumQuality = r3;
        weightInKg = r4;
        price = r5;
    }

    public void display() {
        System.out.println(riceType);
        System.out.println(riceId);
        System.out.println(isPremiumQuality);
        System.out.println(weightInKg);
        System.out.println(price);
    }
}