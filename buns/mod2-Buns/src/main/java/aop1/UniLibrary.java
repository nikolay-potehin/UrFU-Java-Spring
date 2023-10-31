package aop1;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary {
    public void getBook(Book book) {
        System.out.println("Мы берем книгу из UniLibrary " + book.getName());
        System.out.println("-------------------------------------------------");
    }

    public void getMagazine() {
        System.out.println("Мы берем журнал из UniLibrary");
        System.out.println("-------------------------------------------------");
    }

    public void returnBook() {
        System.out.println("Мы возвращаем книгу в UniLibrary ");
    }

    public void returnMagazine() {
        int x = 10/0;
        System.out.println("Мы возвращаем журнал в UniLibrary ");
    }

}
