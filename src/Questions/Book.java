package Questions;

public class Book {
    private String name;
    private String author;
    private double price;
    private int qtyInStock;

    Book(String name, String Author, int price, int qtyInStock) {
        this.name = name;
        this.author=Author;
        this.price = price;
        this.qtyInStock = qtyInStock;

    }
    public String getName() {return name;}
    public double getPrice() {return price;}
    public int getQtyInStock() {return qtyInStock;}
    public String getAuthor() {return author;}

    public void display() {
        System.out.println(getName());
        System.out.println(getPrice());
        System.out.println(getQtyInStock());
        System.out.println(getAuthor());
    }
}
class BookMain {
    public static void main(String[] args) {
        Book ob = new Book("hell","Shakespeare", 2050, 10);
        ob.display();

    }
}

