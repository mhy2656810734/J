package opertion;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @author 26568
 * // 添加书籍
 * @date 2022-05-29 20:55
 */
public class AddOpertion implements IOpertion{
    @Override
    public void work(BookList bookList) {
        System.out.println("新增书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入图书的名字");
        String name = scanner.nextLine();
        System.out.println("请输入作者的名字");
        String author = scanner.nextLine();
        System.out.println("请输入价格");
        int price = scanner.nextInt();
        System.out.println("请输入类型");
        String type = scanner.next();
        Book book = new Book(name,author,price,type);// 输入信息，创建这本书
        int curSize = bookList.getUsedSize();// 得到当前数组的位置
        bookList.setBooks(curSize,book); // 采用尾插法插入书籍
        bookList.setUsedSize(curSize+1); // 让数组下标指向下一个位置
        System.out.println("添加成功");
    }
}
