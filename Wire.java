class Wire {

    int getLength() {
        int length = 30;
        System.out.println("Length is: " + length + " meters");
        return length;
    }
    void displayType(String type) {
        System.out.println("Wire type is: " + type);

        int l = getLength();
        System.out.println("Returned Length: " + l);
    }
    void showDetails() {
        System.out.println("Wire details");
        displayType("Copper Wire");
    }
}

