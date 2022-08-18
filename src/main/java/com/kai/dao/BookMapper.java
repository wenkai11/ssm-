package com.kai.dao;

import com.kai.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author :wk
 * @Description
 * @Date: Created in 16:19 2022/8/17
 * @modified By:
 */
public interface BookMapper {
        int addBook(Books books);
        int deleteBookById(@Param("bookID") int id);
        int updateBook(Books books);
        Books queryBookById(@Param("bookID") int id);
        List<Books> queryAllBooks();
        //查询一本书(书名)
        Books queryBookByName(@Param("bookName") String bookName);

}
