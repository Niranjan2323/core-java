class Silver {

    String silverType;
    int silverId;
    double weightInGrams;
    boolean isHallmarked;
    double price;

    public Silver(String s1, int s2, double s3, boolean s4, double s5) {
        silverType = s1;
        silverId = s2;
        weightInGrams = s3;
        isHallmarked = s4;
        price = s5;
    }

    public void display() {
        System.out.println(silverType);
        System.out.println(silverId);
        System.out.println(weightInGrams);
        System.out.println(isHallmarked);
        System.out.println(price);
    }
}