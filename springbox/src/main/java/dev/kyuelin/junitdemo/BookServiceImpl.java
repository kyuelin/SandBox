package dev.kyuelin.junitdemo;

import java.util.List;

public class BookServiceImpl implements BookService {

    private BookDao bookDao;

    public List<Book> findBookByAuthor(String author) {
        return bookDao.findBookByAuthor(author);
    }
}
