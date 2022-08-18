package com.kai.service;

import com.kai.dao.BookMapper;
import com.kai.pojo.Books;

import java.util.List;

/**
 * @Author :wk
 * @Description
 * @Date: Created in 16:25 2022/8/17
 * @modified By:
 */
public class BookServiceImpl implements BookService{
    private BookMapper bookMapper;
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }
    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }
    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }
    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }
    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }
    @Override
    public List<Books> queryAllBooks() {
        return bookMapper.queryAllBooks();
    }

    @Override
    public Books queryBookByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }
}
