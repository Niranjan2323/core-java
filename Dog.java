class dog {

    int getAge() {
        int age = 5;
        System.out.println("Age is: " + age + " years");
        return age;
    }
    void displayBreed(String breed) {
        System.out.println("Breed is: " + breed);
        int a = getAge();
        System.out.println("Returned Age: " + a);
    }
    void showDetails() {
        System.out.println("Dog details");
        displayBreed("Labrador");
    }
}

