package opertion;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @author 26568
 *   借阅书籍
 * @date 2022-05-29 21:00
 */
public class BorrowOpertion implements IOpertion {
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入图书的名字");
        String name = scanner.nextLine();
        int i = 0;
        for(;i< bookList.getUsedSize();i++) {
            Book book = bookList.getBooks(i); // 得到每次i下标的书籍的信息
            if (book.getName().equals(name)) {
                book.setBorrowed(true);
                System.out.println("借阅成功！");
                return;
            }
        }
        System.out.println("没有要借阅的那本户");
    }
}
