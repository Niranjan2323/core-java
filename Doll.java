class Doll {
    String name;
    String type;
    String color;
    double price;
    boolean isSoft;

    public Doll(String name, String type, String color, double price, boolean isSoft) {
        this.name = name;
        this.type = type;
        this.color = color;
        this.price = price;
        this.isSoft = isSoft;
    }

    public void display() {
        System.out.println("Doll Name: " + this.name);
        System.out.println("Type: " + this.type);
        System.out.println("Color: " + this.color);
        System.out.println("Price: ₹" + this.price);
        System.out.println("Is Soft: " + this.isSoft + "\n");
    }
}

