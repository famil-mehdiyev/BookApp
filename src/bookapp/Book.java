package bookapp;

public class Book {
    public String name;
    public double price;
    public int count;

    public Book(String name, double price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public Book(String name,double price){
        this.name=name;
        this.price=price;
    }
}
