class FaceCreamRunner {
    public static void main(String[] args) {

        FaceCream f1 = new FaceCream("Nivea Soft", 901, true, 100, 250.0);
        f1.display();

        FaceCream f2 = new FaceCream("Ponds Light Moisturizer", 902, false, 150, 300.0);
        f2.display();

        FaceCream f3 = new FaceCream("Himalaya Nourishing Cream", 903, true, 200, 180.0);
        f3.display();

        FaceCream f4 = new FaceCream("Lakme Peach Milk", 904, false, 120, 280.0);
        f4.display();

        FaceCream f5 = new FaceCream("Biotique Morning Nectar", 905, true, 190, 350.0);
        f5.display();
    }
}