package com.kai.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author :wk
 * @Description
 * @Date: Created in 16:14 2022/8/17
 * @modified By:
 */
@Data   //get,set方法
@AllArgsConstructor  //有参构造
@NoArgsConstructor   //无参构造
public class Books {
    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;
}
