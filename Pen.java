class Pen {
    String brand;
    String inkColor;
    double price;
    boolean isRefillable;
    String type;

    public Pen(String brand, String inkColor, double price, boolean isRefillable, String type) {
        this.brand = brand;
        this.inkColor = inkColor;
        this.price = price;
        this.isRefillable = isRefillable;
        this.type = type;
    }

    public void display() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Ink Color: " + this.inkColor);
        System.out.println("Price: ₹" + this.price);
        System.out.println("Refillable: " + this.isRefillable);
        System.out.println("Type: " + this.type + "\n");
    }
}

