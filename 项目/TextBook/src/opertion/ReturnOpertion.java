package opertion;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @author 26568
 *   归还图书
 * @date 2022-05-29 21:02
 */
public class ReturnOpertion implements IOpertion{
    @Override
    public void work(BookList bookList) {
        System.out.println("归还书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入归还图书的名字");
        String name = scanner.nextLine();
        int i = 0;
        for(;i< bookList.getUsedSize();i++) {
            Book book = bookList.getBooks(i); // 得到每次i下标的书籍的信息
            if (book.getName().equals(name)) {
                book.setBorrowed(false);
                System.out.println("归还成功！");
                return;
            }
        }
        System.out.println("没有你要归还的那本书");
    }
}
