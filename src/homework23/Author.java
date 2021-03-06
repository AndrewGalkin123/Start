package homework23;
import java.util.ArrayList;
import java.util.List;
public class Author {
    String name;
    String surname;
    List<Book> listOfBooks= new ArrayList<>();
    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public List<Book> getListOfBooks() {
        return listOfBooks;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public void addBookToList(Book book){
        listOfBooks.add(book);
    }

    @Override
    public String toString() {
        return '\n'+"Автор " + "Имя= " + name  + ", Фамилия= " + surname  + ", Список книг=" + listOfBooks+'\n';
    }
}
