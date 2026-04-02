class LightBillRunner {
    public static void main(String[] args) {

        LightBill l1 = new LightBill("Ravi", 1001, 120, 6.5, 780.0);
        l1.display();

        LightBill l2 = new LightBill("Sita", 1002, 200, 7.0, 1400.0);
        l2.display();

        LightBill l3 = new LightBill("Amit", 1003, 150, 6.0, 900.0);
        l3.display();

        LightBill l4 = new LightBill("Priya", 1004, 90, 5.5, 495.0);
        l4.display();

        LightBill l5 = new LightBill("Kiran", 1005, 300, 7.5, 2250.0);
        l5.display();
    }
}