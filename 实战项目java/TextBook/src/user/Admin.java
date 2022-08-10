package user;

import opertion.*;

import java.util.Scanner;

/**
 * @author 26568
 * 管理员
 * @date 2022-05-29 21:27
 */
public class Admin extends User{
    public Admin(String name) {
        super(name);
        this.opertions = new IOpertion[]{
                new ExitOpertion(),
                new FindOpertion(),
                new AddOpertion(),
                new DelOpertion(),
                new DisplayOpertion(),
                new SortOperation
        };
    }

    @Override
    public int menu() {
        System.out.println("================================");
        System.out.println("Hello"+this.name + "欢迎来到图书系统");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.展示所有图书");
        System.out.println("0.退出系统");
        System.out.println("================================");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        return choice;
    }
}
