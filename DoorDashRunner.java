class DoorDashRunner {

    public static void main(String[] args) {

        int unitCost = DoorDash.getFoodPrice("big mac");
        System.out.println("Single Price: " + unitCost);

        int finalAmount = DoorDash.calculateFinalBill("big mac", unitCost, 3);
        System.out.println("Total Price: " + finalAmount);
    }
}