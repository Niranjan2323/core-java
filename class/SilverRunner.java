class SilverRunner {
    public static void main(String[] args) {

        Silver s1 = new Silver("Silver Coin", 1601, 20.5, true, 3500.0);
        s1.display();

        Silver s2 = new Silver("Silver Necklace", 1602, 50.0, true, 12000.0);
        s2.display();

        Silver s3 = new Silver("Silver Ring", 1603, 10.0, false, 2500.0);
        s3.display();

        Silver s4 = new Silver("Silver Bracelet", 1604, 30.0, true, 8000.0);
        s4.display();

        Silver s5 = new Silver("Silver Earrings", 1605, 15.0, false, 4000.0);
        s5.display();
    }
}