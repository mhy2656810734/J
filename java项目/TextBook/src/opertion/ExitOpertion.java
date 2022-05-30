package opertion;

import book.BookList;

/**
 * @author 26568
 *   退出系统
 * @date 2022-05-29 21:01
 */
public class ExitOpertion implements  IOpertion {
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统！");
        System.exit(1);
    }
}
