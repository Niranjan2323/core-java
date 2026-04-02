class UpsRunner {
    public static void main(String[] args) {
        Ups u1 = new Ups("PKG101", "Rahul", "varun", 2.5, true);
        Ups u2 = new Ups("PKG102", "Amit", "Niranjan", 1.2, false);
        Ups u3 = new Ups("PKG103", "Kiran", "yashu", 3.8, true);
        Ups u4 = new Ups("PKG104", "Yashwanth", "Arjun", 0.9, false);
        Ups u5 = new Ups("PKG105", "Shivu", "Vikram", 4.1, true);

        u1.display();
        u2.display();
        u3.display();
        u4.display();
        u5.display();
    }
}