class Auto {

    String vehicleName;
    int vehicleId;
    boolean isElectric;
    int seatingCapacity;
    double price;

    public Auto(String v1, int v2, boolean v3, int v4, double v5) {
        vehicleName = v1;
        vehicleId = v2;
        isElectric = v3;
        seatingCapacity = v4;
        price = v5;
    }

    public void display() {
        System.out.println(vehicleName);
        System.out.println(vehicleId);
        System.out.println(isElectric);
        System.out.println(seatingCapacity);
        System.out.println(price);
    }
}