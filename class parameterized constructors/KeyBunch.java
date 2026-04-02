class KeyBunch {
    int numberOfKeys;
    String material;
    double weight;
    boolean hasKeyChain;
    String ownerName;

    public KeyBunch(int numberOfKeys, String material, double weight, boolean hasKeyChain, String ownerName) {
        this.numberOfKeys = numberOfKeys;
        this.material = material;
        this.weight = weight;
        this.hasKeyChain = hasKeyChain;
        this.ownerName = ownerName;
    }

    public void display() {
        System.out.println("Number of Keys: " + this.numberOfKeys);
        System.out.println("Material: " + this.material);
        System.out.println("Weight: " + this.weight + " grams");
        System.out.println("Has KeyChain: " + this.hasKeyChain);
        System.out.println("Owner Name: " + this.ownerName + "\n");
    }
}

