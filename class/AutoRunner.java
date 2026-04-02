class AutoRunner {
    public static void main(String[] args) {

        Auto a1 = new Auto("Tesla Model 3", 701, true, 5, 6000000.0);
        a1.display();

        Auto a2 = new Auto("Hyundai i20", 702, false, 5, 800000.0);
        a2.display();

        Auto a3 = new Auto("Kia EV6", 703, true, 5, 6500000.0);
        a3.display();

        Auto a4 = new Auto("Maruti Swift", 704, false, 5, 700000.0);
        a4.display();

        Auto a5 = new Auto("Tata Nexon EV", 705, true, 5, 1500000.0);
        a5.display();
    }
}