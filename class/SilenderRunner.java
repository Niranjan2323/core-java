class SilenderRunner {
    public static void main(String[] args) {

        Silender s1 = new Silender("Kushal", 1101, true, 14.2, 1100.0);
        s1.display();

        Silender s2 = new Silender("Yogesh", 1102, false, 14.2, 0.0);
        s2.display();

        Silender s3 = new Silender("Niranjan", 1103, true, 14.2, 1150.0);
        s3.display();

        Silender s4 = new Silender("Varun", 1104, true, 19.0, 1800.0);
        s4.display();

        Silender s5 = new Silender("Yashwanth", 1105, false, 14.2, 0.0);
        s5.display();
    }
}