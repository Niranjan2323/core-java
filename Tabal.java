class Tabal {

    int getSize() {
        int size = 10;
        System.out.println("Size is: " + size + " inches");
        return size;
    }
    void displaySound(String sound) {
        System.out.println("Sound type is: " + sound);

        int s = getSize();
        System.out.println("Returned Size: " + s);
   }
    void showDetails() {
        System.out.println("Tabal details");
        displaySound("Bass");
    }
}

