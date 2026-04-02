class DollRunner {
    public static void main(String[] args) {
        Doll d1 = new Doll("Barbie", "Fashion", "Pink", 799.0, true);
        Doll d2 = new Doll("Chhota Bheem", "Cartoon", "Yellow", 499.0, false);
        Doll d3 = new Doll("Teddy Doll", "Stuffed", "Brown", 999.5, true);
        Doll d4 = new Doll("Princess Doll", "Fantasy", "Blue", 850.0, false);
        Doll d5 = new Doll("Baby Doll", "Realistic", "White", 650.0, true);

        d1.display();
        d2.display();
        d3.display();
        d4.display();
        d5.display();
    }
}