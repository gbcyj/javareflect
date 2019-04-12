//Book
//        id\name\price\author
//        setter|getter
//        contructor(3)
//        其他方法：
//            public\private
//        使用反射完成Book类的实例化、方法和属性的调用。
//
//
package com.reflect;
public class Book {
    private int id;
    private String  name;
    private double price;
    private String author;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public Book() {
        this.name="noname";
    }

    public Book(int id, String name, double price, String author) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public Book(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public void printBookInfo(){
        System.out.println("bookName is"+this.name);
    }
    private int GetnameLength(){
        return name.length();
    }

    @Override
    public String toString() {
        return this.name;
    }
}
