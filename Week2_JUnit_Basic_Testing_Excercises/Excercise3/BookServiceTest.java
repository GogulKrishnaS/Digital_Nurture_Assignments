import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {

    BookService bookService;

    @BeforeEach
    void setUp() {
        bookService = new BookService();
        bookService.addBook("Java Fundamentals");
        bookService.addBook("JUnit in Action");
    }

    @AfterEach
    void tearDown() {
        bookService.clearLibrary();
    }

    @Test
    void testBookIsAvailable() {
        boolean available = bookService.isBookAvailable("Java Fundamentals");

        assertTrue(available, "Book should be available in the library");
    }

    @Test
    void testBookNotAvailable() {
        boolean available = bookService.isBookAvailable("Spring Boot Guide");

        assertFalse(available, "Book should not be available in the library");
    }

    @Test
    void testBookCountAfterAdding() {
        int count = bookService.getBookCount();

        assertEquals(2, count, "Library should initially contain 2 books");
    }

    @Test
    void testLibraryClearsOnTeardown() {
        assertEquals(2, bookService.getBookCount());
    }
}
