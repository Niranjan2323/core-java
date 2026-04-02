class GiftRunner {
    public static void main(String[] args) {

        Gift g1 = new Gift("Teddy Bear", 1501, true, 1, 500.0);
        g1.display();

        Gift g2 = new Gift("Flower Bouquet", 1502, true, 1, 300.0);
        g2.display();

        Gift g3 = new Gift("Chocolate Box", 1503, false, 2, 600.0);
        g3.display();

        Gift g4 = new Gift("Perfume Set", 1504, true, 1, 1200.0);
        g4.display();

        Gift g5 = new Gift("Greeting Card", 1505, false, 5, 250.0);
        g5.display();
    }
}