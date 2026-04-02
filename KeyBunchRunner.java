class KeyBunchRunner {
    public static void main(String[] args) {
        KeyBunch k1 = new KeyBunch(5, "Steel", 120.5, true, "Rahul");
        KeyBunch k2 = new KeyBunch(3, "Aluminum", 80.0, false, "Anita");
        KeyBunch k3 = new KeyBunch(7, "Brass", 150.2, true, "Kiran");
        KeyBunch k4 = new KeyBunch(4, "Plastic", 60.3, false, "Neha");
        KeyBunch k5 = new KeyBunch(6, "Iron", 140.0, true, "Arjun");

        k1.display();
        k2.display();
        k3.display();
        k4.display();
        k5.display();
    }
}