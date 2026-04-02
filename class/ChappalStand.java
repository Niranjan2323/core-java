class ChappalStand {

    String standMaterial;
    int standId;
    int numberOfShelves;
    int capacity;
    double price;

    public ChappalStand(String s1, int s2, int s3, int s4, double s5) {
        standMaterial = s1;
        standId = s2;
        numberOfShelves = s3;
        capacity = s4;
        price = s5;
    }

    public void display() {
        System.out.println(standMaterial);
        System.out.println(standId);
        System.out.println(numberOfShelves);
        System.out.println(capacity);
        System.out.println(price);
    }
}