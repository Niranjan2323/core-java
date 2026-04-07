class ZomatoRunner {

    public static void main(String[] args) {

        int unitCost = Zomato.findFoodCost("biryani");
        System.out.println("Cost per item: " + unitCost);

        int finalBill = Zomato.computeTotalAmount("biryani", unitCost, 2);
        System.out.println("Total Bill: " + finalBill);
    }
}