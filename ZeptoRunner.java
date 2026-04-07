class ZeptoRunner {

    public static void main(String[] args) {

        int unitCost = Zepto.getItemPrice("milk");
        System.out.println("Price per item: " + unitCost);

        int finalAmount = Zepto.calculateTotalAmount("milk", unitCost, 4);
        System.out.println("Total Amount: " + finalAmount);
    }
}