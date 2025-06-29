import java.util.ArrayList;
import java.util.List;

public class BookService {

    private final List<String> books = new ArrayList<>();

    public void addBook(String bookName) {
        books.add(bookName);
    }

    public boolean isBookAvailable(String bookName) {
        return books.contains(bookName);
    }

    public void clearLibrary() {
        books.clear();
    }

    public int getBookCount() {
        return books.size();
    }
}
