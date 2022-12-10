package ch21;

public class ObjectCopyTest {
    public static void main(String[] args) {
        // book 객체의 주소값 설정
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];
        library[0] = new Book("book1", "kim");
        library[1] = new Book("book2", "kim");
        library[2] = new Book("book3", "kim");
        library[3] = new Book("book4", "kim");
        library[4] = new Book("book5", "kim");

        System.arraycopy(library, 0, copyLibrary, 0, 5);

        System.out.println(" original lib ");
        for (Book book : library){
            System.out.println(book);

            book.showInfo();
        }
        System.out.println();
        System.out.println(" copy lib ");
        for (Book book : copyLibrary){
            System.out.println(book);

            book.showInfo();
        }

        // 주소값도 같음
        // 얕은 복사로 인해 original lib를 변경하면 copy lib의 내용도 변경됨.
        // 주소만 복사됨. 결국 복사는 됐으나 같은 내용을 들고 있다는 뜻.

        library[0].setAuthor("lee");
        library[0].setTitle("books1");



    }
}
