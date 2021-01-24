package 图书管理.book;

/**
 * Created with IntelliJ IDEA.
 * Description:图书
 * User: starry
 * Date: 2021 -01 -20
 * Time: 18:08
 */
public class Book {

    /**
     *图书的所有属性
     */
    private String name;    //图书名称
    private String author;  //作者
    private int price;      //价格
    private String type;    //类型
    private boolean status; //借出状态：默认false

    /**
     * 创建构造方法
     * @param name
     * @param author
     * @param price
     * @param type
     */
    public Book(String name, String author, int price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    /**
     * 既然封装了起来，编写get和set方法之后来调用Book中的属性
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * 提供打印所有属性的toString方法
     * @return
     */
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", status=" + status +
                '}';
    }
}
