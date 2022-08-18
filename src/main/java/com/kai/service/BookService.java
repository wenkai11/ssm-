package com.kai.service;

import com.kai.pojo.Books;

import java.util.List;

/**
 * @Author :wk
 * @Description
 * @Date: Created in 16:24 2022/8/17
 * @modified By:
 */
public interface BookService {
    int addBook(Books books);
    int deleteBookById(int id);
    int updateBook(Books books);
    Books queryBookById(int id);
    List<Books> queryAllBooks();
    Books queryBookByName(String bookName);
}
