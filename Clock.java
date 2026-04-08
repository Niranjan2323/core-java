class Clock {

    int getTime() {
        int time = 12;
        System.out.println("Time is: " + time + " o'clock");
        return time;
    }
    void displayType(String type) {
        System.out.println("Clock type is: " + type);

        int t = getTime();
        System.out.println("Returned Time: " + t);
    }
    void showDetails() {
        System.out.println("Clock details");
        displayType("Wall Clock");
    }
}

