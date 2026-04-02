class FlowerRunner {
    public static void main(String[] args) {
        Flower f1 = new Flower("Rose", "Red", 15.0, true, 32);
        Flower f2 = new Flower("Lily", "White", 20.0, true, 6);
        Flower f3 = new Flower("Sunflower", "Yellow", 10.0, false, 20);
        Flower f4 = new Flower("Lotus", "Pink", 12.0, false, 8);
        Flower f5 = new Flower("Jasmine", "White", 5.0, true, 10);
        Flower f6 = new Flower("Orchid", "Purple", 25.0, false, 5);
        Flower f7 = new Flower("Marigold", "Orange", 7.0, false, 18);

        f1.display();
        f2.display();
        f3.display();
        f4.display();
        f5.display();
        f6.display();
        f7.display();
    }
}