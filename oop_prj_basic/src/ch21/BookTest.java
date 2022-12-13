package ch21;

public class BookTest {
    public static void main(String[] args) {
        // book 객체의 주소값 설정
        Book[] library = new Book[5];

        library[0] = new Book("book1", "kim");
        library[1] = new Book("book2", "kim");
        library[2] = new Book("book3", "kim");
        library[3] = new Book("book4", "kim");
        library[4] = new Book("book5", "kim");

        for (Book book : library){
            System.out.println(book);

            book.showInfo();
        }


    }
}
