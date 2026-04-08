class Oli {
    int getVolume() {
        int values = 2;
        System.out.println("Values is: " + values + " liters");
        return values;
    }
    void displayType(String type) {
        System.out.println("Oil type is: " + type);

        int v = getValues();
        System.out.println("Returned Values: " + v);
    }
    void showDetails() {
        System.out.println("Oil details");
        displayType("Coconut Oil");
    }
}

