class Card {

    int getNumber() {
        int number = 1234;
        System.out.println("Card number is: " + number);
        return number;
    }
    void displayHolder(String holder) {
        System.out.println("Card holder name is: " + holder);

        int n = getNumber();
        System.out.println("Returned Number: " + n);
    }
    void showDetails() {
        System.out.println("Card details");
        displayHolder("Ravi");
    }
}

