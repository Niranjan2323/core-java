class RemoteRunner {
    public static void main(String[] args) {
        Remote r1 = new Remote("Sony", "TV", 500, true, 20, 1500.0);
        Remote r2 = new Remote("Samsung", "AC", 1000, false, 15, 1200.0);
        Remote r3 = new Remote("LG", "Music System", 800, true, 18, 1000.0);
        Remote r4 = new Remote("Philips", "TV", 600, false, 25, 1300.0);
        Remote r5 = new Remote("Panasonic", "AC", 1200, true, 16, 1400.0);
        Remote r6 = new Remote("Vu", "TV", 450, false, 22, 1100.0);
        Remote r7 = new Remote("Toshiba", "Music System", 700, true, 19, 1250.0);

        r1.display();
        r2.display();
        r3.display();
        r4.display();
        r5.display();
        r6.display();
        r7.display();
    }
}