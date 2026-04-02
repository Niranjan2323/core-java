class FaceCream {

    String creamName;
    int creamId;
    boolean isForSensitiveSkin;
    int weightInGrams;
    double price;

    public FaceCream(String c1, int c2, boolean c3, int c4, double c5) {
        creamName = c1;
        creamId = c2;
        isForSensitiveSkin = c3;
        weightInGrams = c4;
        price = c5;
    }

    public void display() {
        System.out.println(creamName);
        System.out.println(creamId);
        System.out.println(isForSensitiveSkin);
        System.out.println(weightInGrams);
        System.out.println(price);
    }
}