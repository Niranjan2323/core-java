class LightBill {

    String customerName;
    int billId;
    int unitsConsumed;
    double costPerUnit;
    double totalAmount;

   
    public LightBill(String c1, int c2, int c3, double c4, double c5) {
        customerName = c1;
        billId = c2;
        unitsConsumed = c3;
        costPerUnit = c4;
        totalAmount = c5;
    }

   
    public void display() {
        System.out.println(customerName);
        System.out.println(billId);
        System.out.println(unitsConsumed);
        System.out.println(costPerUnit);
        System.out.println(totalAmount);
    }
}