package com.kai.controller;

import com.kai.pojo.Books;
import com.kai.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author :wk
 * @Description
 * @Date: Created in 16:41 2022/8/17
 * @modified By:
 */
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;
     @RequestMapping("/allBook")
    public String testallBook(Model model){
      //查询所有的书籍并且返回一个书籍展示页面
         List<Books> list = bookService.queryAllBooks();
         model.addAttribute("list",list);
         return "allBook";
     }
     //跳转到增加书籍界面
     @RequestMapping("/toaddBook")
     public String toaddBook(){
         return "addBook";
     }
     //添加书籍的请求
    @RequestMapping("/addBook")
    public String addBook(Books books){
        System.out.println("addBook=>"+books);
        bookService.addBook(books);
        return "redirect:/book/allBook"; //重定向到"/allbook"页面
    }
    //跳转到修改页面
    @RequestMapping("/toUpdate")
    public String toUpdate(int id,Model model){
        Books books = bookService.queryBookById(id);
        model.addAttribute("Qbook",books);
        return "updateBook";
    }
    //修改书籍
    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        System.out.println("updateBook=>"+books);
        int i =bookService.updateBook(books);
        if(i>0){
            System.out.println("修改成功"+books);
        }
        List<Books> list = bookService.queryAllBooks();
        list.forEach(li-> System.out.println(li));
        return "redirect:/book/allBook";
    }
    //删除书籍
    @RequestMapping("/deleteBook/{bookID}")
    public String deleteBook(@PathVariable("bookID")int id){
    bookService.deleteBookById(id);
    return "redirect:/book/allBook";
    }
    //查询书籍
    @RequestMapping("/queryBook")
    public String queryBook(String queryName,Model model){
         Books books = bookService.queryBookByName(queryName);
         List<Books> list = new ArrayList<>();
         list.add(books);

        if (books==null) {
            list = bookService.queryAllBooks();
            model.addAttribute("error", "未查到");
        }
        model.addAttribute("list", list);
        return "allBook";
    }
}
