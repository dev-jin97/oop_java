package ch21;

public class ObjectCopyTest2 {
    public static void main(String[] args) {
        // TODO: 2022/12/10 깊은 복사
        // book 객체의 주소값 설정
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];
        library[0] = new Book("book1", "kim");
        library[1] = new Book("book2", "kim");
        library[2] = new Book("book3", "kim");
        library[3] = new Book("book4", "kim");
        library[4] = new Book("book5", "kim");

        copyLibrary[0] = new Book();
        copyLibrary[1] = new Book();
        copyLibrary[2] = new Book();
        copyLibrary[3] = new Book();
        copyLibrary[4] = new Book();
        int num = 0;
        for (Book book : library){

            copyLibrary[num].setAuthor(book.getAuthor());
            copyLibrary[num].setTitle(book.getTitle());

            num++;
        }


        // 주소를 다르게 생성, 전혀 다른 위치의 데이터가 됨.

        for (Book book : copyLibrary){
            book.showInfo();
        }





    }
}
