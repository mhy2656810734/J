package opertion;

import book.Book;
import book.BookList;

/**
 * @author 26568
 *   展示书籍
 * @date 2022-05-29 21:01
 */
public class DisplayOpertion implements IOpertion{
    @Override
    public void work(BookList bookList) {
        System.out.println("展示书籍");
        int i = 0;
        for(;i< bookList.getUsedSize();i++) {
            Book book = bookList.getBooks(i);// 得到下标为i的书籍的信息
            System.out.println(book);
        }
    }
}
