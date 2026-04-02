class Bike {

    String bikeName;
    int bikeId;
    boolean isAvailable;
    int engineCC;
    double price;
	
    public Bike(String b1, int b2, boolean b3, int b4, double b5) {
        bikeName = b1;
        bikeId = b2;
        isAvailable = b3;
        engineCC = b4;
        price = b5;
    }

    public void display() {
        System.out.println(bikeName);
        System.out.println(bikeId);
        System.out.println(isAvailable);
        System.out.println(engineCC);
        System.out.println(price);
    }
}