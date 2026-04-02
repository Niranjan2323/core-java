class ChappalStandRunner {
    public static void main(String[] args) {

        ChappalStand c1 = new ChappalStand("Plastic", 1201, 3, 9, 1200.0);
        c1.display();

        ChappalStand c2 = new ChappalStand("Wood", 1202, 4, 12, 2500.0);
        c2.display();

        ChappalStand c3 = new ChappalStand("Steel", 1203, 5, 15, 3000.0);
        c3.display();

        ChappalStand c4 = new ChappalStand("Fiber", 1204, 2, 6, 900.0);
        c4.display();

        ChappalStand c5 = new ChappalStand("Metal", 1205, 6, 18, 3500.0);
        c5.display();
    }
}