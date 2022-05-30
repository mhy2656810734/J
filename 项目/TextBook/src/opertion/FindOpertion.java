package opertion;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @author 26568
 *   查找书籍
 * @date 2022-05-29 21:01
 */
public class FindOpertion implements IOpertion{
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入图书的名字");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int i = 0;
        for(;i< bookList.getUsedSize();i++) {
            Book book = bookList.getBooks(i); // 得到每次i下标的书籍的信息
            if (book.getName().equals(name)) {
                System.out.println(book);
                System.out.println("查找成功");
                return;
            }
        }
        System.out.println("您查找的书籍不存在");
    }
}
