class ChocolateRunner {
    public static void main(String[] args) {

        Chocolate c1 = new Chocolate("Dairy Milk", 1301, false, 50, 100.0);
        c1.display();

        Chocolate c2 = new Chocolate("KitKat", 1302, false, 40, 50.0);
        c2.display();

        Chocolate c3 = new Chocolate("Bournville", 1303, true, 80, 150.0);
        c3.display();

        Chocolate c4 = new Chocolate("Snickers", 1304, false, 60, 120.0);
        c4.display();

        Chocolate c5 = new Chocolate("Lindt Dark", 1305, true, 100, 300.0);
        c5.display();
    }
}