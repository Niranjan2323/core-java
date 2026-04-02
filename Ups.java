class Ups {
    String packageId;
    String senderName;
    String receiverName;
    double weight;
    boolean isDelivered;

    public Ups(String packageId, String senderName, String receiverName, double weight, boolean isDelivered) {
        this.packageId = packageId;
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.weight = weight;
        this.isDelivered = isDelivered;
    }

    public void display() {
        System.out.println("Package ID: " + this.packageId);
        System.out.println("Sender: " + this.senderName);
        System.out.println("Receiver: " + this.receiverName);
        System.out.println("Weight: " + this.weight + " kg");
        System.out.println("Delivered: " + this.isDelivered + "\n");
    }
}

