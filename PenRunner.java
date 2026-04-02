class PenRunner {
    public static void main(String[] args) {
        Pen p1 = new Pen("Reynolds", "Blue", 10.0, true, "Ballpoint");
        Pen p2 = new Pen("Parker", "Black", 150.0, true, "Fountain");
        Pen p3 = new Pen("Cello", "Red", 12.0, false, "Gel");
        Pen p4 = new Pen("Lexi", "Green", 8.0, false, "Ballpoint");
        Pen p5 = new Pen("Pilot", "Blue", 50.0, true, "Gel");

        p1.display();
        p2.display();
        p3.display();
        p4.display();
        p5.display();
    }
}