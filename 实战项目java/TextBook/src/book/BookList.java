package book;

/**
 * @author 26568
 *  书：顺序表存放书籍
 * @date 2022-05-29 20:54
 */
public class BookList {
    private Book[] books = new Book[100];
    private int usedSize = 0;

    public Book getBooks(int pos) {
        return this.books[pos];
    }

    public void setBooks(int pos,Book book) {
        this.books[pos] = book; // 添加书籍
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

    public BookList() {
        books[0] = new Book("三国演义","罗贯中",100,"小说");
        books[1] = new Book("西游记","吴承恩",85,"小说");
        books[2] = new Book("水浒传","施耐庵",95,"小说");
        this.usedSize = 3;// 默认有上面三本书

    }
}
