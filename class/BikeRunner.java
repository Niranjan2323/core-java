class BikeRunner {
    public static void main(String[] args) {

        Bike b1 = new Bike("Royal Enfield Classic 350", 801, true, 350, 190000.0);
        b1.display();

        Bike b2 = new Bike("KTM Duke 200", 802, true, 200, 180000.0);
        b2.display();

        Bike b3 = new Bike("Yamaha R15", 803, false, 155, 170000.0);
        b3.display();

        Bike b4 = new Bike("Honda Shine", 804, true, 125, 90000.0);
        b4.display();

        Bike b5 = new Bike("Bajaj Pulsar 150", 805, true, 150, 110000.0);
        b5.display();
    }
}