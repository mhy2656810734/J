package user;

import opertion.*;

import java.util.Scanner;

/**
 * @author 26568
 *  普通用户
 * @date 2022-05-29 21:28
 */
public class NormalUser extends User{
    public NormalUser(String name) {
        super(name);
        this.opertions = new IOpertion[] {
          new ExitOpertion(),
          new FindOpertion(),
          new BorrowOpertion(),
          new ReturnOpertion()
        };
    }

    @Override
    public int menu() {
        System.out.println("================================");
        System.out.println("Hello"+this.name + "欢迎来到图书系统");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("0.退出系统");
        System.out.println("================================");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        return choice;
    }
}
