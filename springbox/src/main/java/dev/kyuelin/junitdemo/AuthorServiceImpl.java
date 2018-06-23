package dev.kyuelin.junitdemo;

import java.util.List;
import java.util.stream.Collectors;

public class AuthorServiceImpl implements AuthorService {

    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    public void setBookValidatorService(BookValidatorService bookValidatorService) {
        this.bookValidatorService = bookValidatorService;
    }

    private BookService bookService;
    private BookValidatorService bookValidatorService;

    public int getTotalBooks(String author) {
        List<Book> books = bookService.findBookByAuthor(author);
        List<Book> filtered = books.stream().filter( x -> bookValidatorService.isValid(x)).collect(Collectors.toList());
        return filtered.size();
    }
}
