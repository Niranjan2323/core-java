class RiceRunner {
    public static void main(String[] args) {

        Rice r1 = new Rice("Basmati", 1401, true, 5, 600.0);
        r1.display();

        Rice r2 = new Rice("Sona Masoori", 1402, true, 10, 900.0);
        r2.display();

        Rice r3 = new Rice("Brown Rice", 1403, false, 3, 300.0);
        r3.display();

        Rice r4 = new Rice("Kolam Rice", 1404, true, 8, 700.0);
        r4.display();

        Rice r5 = new Rice("Ponni Rice", 1405, false, 6, 500.0);
        r5.display();
    }
}