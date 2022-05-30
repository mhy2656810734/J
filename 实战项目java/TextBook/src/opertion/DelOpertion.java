package opertion;

import book.Book;
import book.BookList;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.Scanner;

/**
 * @author 26568
 *   删除书籍
 * @date 2022-05-29 21:00
 */
public class DelOpertion implements IOpertion{
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除图书的名字");
        String name = scanner.nextLine();
        int i = 0;
        for(;i< bookList.getUsedSize();i++) {
            Book book = bookList.getBooks(i); // 得到每次i下标的书籍的信息
            if (book.getName().equals(name)) {
                break;
            }
        }
        if (i == bookList.getUsedSize()) {
            System.out.println("该书籍不存在");
        } else {
            // 删除书籍
            for (int pos  = i;pos< bookList.getUsedSize()-1;pos++) {
                // 将pos+1位置的书放到pos位置
                Book book = bookList.getBooks(pos+1);// 得到pos+1位置的数据
                bookList.setBooks(pos,book);  // 放到pos位置
                //bookList.setBooks(pos,bookList.getBooks(pos+1));
            }
            bookList.setUsedSize(bookList.getUsedSize()-1);
            System.out.println("删除成功");
        }
    }
}
