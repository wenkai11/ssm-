import com.kai.pojo.Books;
import com.kai.service.BookService;
import com.kai.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author :wk
 * @Description
 * @Date: Created in 16:50 2022/8/17
 * @modified By:
 */
public class Mytest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        BookService bookServiceImpl = context.getBean( BookServiceImpl.class);

        for (Books books : bookServiceImpl.queryAllBooks()) {
            System.out.println(books);
        }
        }
}

