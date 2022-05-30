package user;

import book.BookList;
import opertion.IOpertion;

/**
 * @author 26568
 * @date 2022-05-29 21:27
 */
public abstract class User {
protected String name;
protected IOpertion[] opertions;
public User(String name) {
    this.name = name;
}
public abstract int menu();
public  void doOpertion(BookList bookList,int choice) {
    this.opertions[choice].work(bookList);
}
}
