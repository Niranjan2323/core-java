class BookOutput{
public static void main(String[] args) {

        Book book = new Book();
        book.name = "kannada copywriting";
        book.length = 10;
        book.thickness = 1.5;
        book.grade = 'A';
        book.isAvailable = true;
        book.price = 50;

        Book book1 = new Book();
        book1.name = "english copywriting";
        book1.length = 20;
        book1.thickness = 1.0;
        book1.grade = 'B';
        book1.isAvailable = false;
        book1.price = 80;

        Book book2 = new Book();
        book2.name = "hindi copywriting";
        book2.length = 15;
        book2.thickness = 1.8;
        book2.grade = 'C';
        book2.isAvailable = true;
        book2.price = 60;    
    }
}