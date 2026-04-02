class Remote {
    String brand;
    String type;          
    int batteryLifeHours;
    boolean hasVoiceControl;
    int numberOfButtons;
    double price;

    
    public Remote(String brand, String type, int batteryLifeHours, boolean hasVoiceControl, int numberOfButtons, double price) {
        this.brand = brand;
        this.type = type;
        this.batteryLifeHours = batteryLifeHours;
        this.hasVoiceControl = hasVoiceControl;
        this.numberOfButtons = numberOfButtons;
        this.price = price;
    }

    public void display() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Type: " + this.type);
        System.out.println("Battery Life: " + this.batteryLifeHours + " hours");
        System.out.println("Voice Control: " + this.hasVoiceControl);
        System.out.println("Number of Buttons: " + this.numberOfButtons);
        System.out.println("Price: ₹" + this.price + "\n");
    }
}

