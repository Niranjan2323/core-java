class Boomer {

    int getRange() {
        int range = 50;
        System.out.println("Range is: " + range + " meters");
        return range;
    }
    void displayType(String type) {
        System.out.println("Type is: " + type);

        int r = getRange();
        System.out.println("Returned Range: " + r);
   }
    void showDetails() {
        System.out.println("Boomer details");
        displayType("Boomerang");
    }
}

