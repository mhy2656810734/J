import book.Book;
import book.BookList;
import user.Admin;
import user.NormalUser;
import user.User;

import java.util.Scanner;

/**
 * @author 26568
 *  代码整合
 * @date 2022-05-29 20:50
 */
public class TextMain {
    public static User login() {
        System.out.println("请输入您的名字");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("请选择您的身份：1---管理员   0---普通用户");
        int choice = scan.nextInt();
        if (choice == 1) {
            return new Admin(name); // 向上转型
        } else {
            return new NormalUser(name);
        }
    }
    public static void main(String[] args) {
        // 1.先默认有三本书
        BookList bookList = new BookList();
        // 2.登录操作 (向上转型)
        User user = login();
        while (true) {
            int choice = user.menu();
            // 选择几就执行那个操作
            user.doOpertion(bookList,choice);
        }

    }
}
