class LaptopOutput{
public static void main(String[] args) {

        Laptop laptop = new Laptop();
        laptop.brend = "hp";
        laptop.length = 3;
        laptop.price = 67000f;
        laptop.grade = 'A';
        laptop.isTouchscreen = true;
        laptop.id = 3354656454673L;

        Laptop laptop1 = new Laptop();
        laptop1.brand = "lg";
        laptop1.length = 3.5;
        laptop1.price = 100000f;
        laptop1.grade = 'B';
        laptop1.isTouchscreen = false;
        laptop1.id = 86974756478543L;

        Laptop laptop2 = new Laptop();
        laptop2.material = "dell";
        laptop2.length = 5.0;
        laptop2.price = 180000f;
        laptop2.grade = 'C';
        laptop2.isTouchscreen = true;
        laptop2.id = 658598956789L;    
    }
}