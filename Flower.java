class Flower {
    String name;
    String color;
    double pricePerStem;
    boolean isFragrant;
    int petalsCount;

    public Flower(String name, String color, double pricePerStem, boolean isFragrant, int petalsCount) {
        this.name = name;
        this.color = color;
        this.pricePerStem = pricePerStem;
        this.isFragrant = isFragrant;
        this.petalsCount = petalsCount;
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Color: " + this.color);
        System.out.println("Price per Stem: ₹" + this.pricePerStem);
        System.out.println("Fragrant: " + this.isFragrant);
        System.out.println("Number of Petals: " + this.petalsCount + "\n");
    }
}



