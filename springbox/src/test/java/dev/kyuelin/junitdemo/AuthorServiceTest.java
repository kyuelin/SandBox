package dev.kyuelin.junitdemo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AuthorServiceTest {

    @Test
    public void test_total_book_by_mockito() {
        List<Book> books = Arrays.asList(
                new Book("machine"),
                new Book("learning"),
                new Book("ai")
        );

        //BookServiceImpl bookService = mock(BookServiceImpl.class);
        BookService bookService = mock(BookServiceImpl.class);
        when(bookService.findBookByAuthor("stephan")).thenReturn(books);

        BookValidatorService bookValidatorService = mock(BookValidatorServiceImpl.class);
        when(bookValidatorService.isValid(new Book("machine"))).thenReturn(true);
        when(bookValidatorService.isValid(new Book("learning"))).thenReturn(true);

        AuthorServiceImpl authorService = new AuthorServiceImpl();
        authorService.setBookService(bookService);
        authorService.setBookValidatorService(bookValidatorService);

        int qty = authorService.getTotalBooks("stephan");
        assertEquals(2, qty);
    }
}
