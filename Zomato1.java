class Zomato1 {

    String firstName;
    String secondName;
    int age;
    String city;

   
    Zomato1() {
        this("Niranjan");
        System.out.println("Zomato1 Const 1 ");
    }

    Zomato1(String firstName) {
        this(firstName, "varun");
        System.out.println("Zomato1 Const 2");
    }

        Zomato1(String firstName, String secondName) {
        this(firstName, secondName, 21);
        System.out.println("Zomato1 Const 3");
    }

        Zomato1(String firstName, String secondName, int age) {
        this(firstName, secondName, age, "Mysuru");
        System.out.println("Zomato1 Const 4");
    }

        Zomato1(String firstName, String secondName, int age, String city) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.city = city;

        System.out.println("Zomato1 Const 5");
        System.out.println("firstName : " + this.firstName);
        System.out.println("secondName : " + this.secondName);
        System.out.println("age : " + this.age);
        System.out.println("city : " + this.city);
    }
}