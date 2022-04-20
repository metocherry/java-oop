package com.joy.prototype;

import java.util.ArrayList;

// clone 메서드를 사용하기 위해서는 Cloneable 을 implements 해야한다.
// Cloneable 은 mark interface 이다.
public class BookShelf implements Cloneable {

    private ArrayList<Book> shelf;

    public BookShelf() {
        shelf = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        shelf.add(book);
    }

    public ArrayList<Book> getShelf() {
        return shelf;
    }

    public void setShelf(ArrayList<Book> shelf) {
        this.shelf = shelf;
    }

    @Override
    public String toString() {
        return shelf.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // return super.clone();    // shallow copy

        BookShelf another = new BookShelf();

        for (Book book : shelf) {
            another.addBook(new Book(book.getAuthor(), book.getTitle()));
        }

        return another;
    }
}
