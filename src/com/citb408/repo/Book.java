package com.citb408.repo;

public class Book extends Document {
    private Author author;//make an association between both classes, not inheritance
    private String isbn;

    public Book(String name, double size, String fileFormat, Author author, String isbn) {
        super(name, size, fileFormat);//this statement should be at the first place
        this.author = author;
        this.isbn = isbn;

    }

    public Author getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", isbn='" + isbn + '\'' +
                "} " + super.toString();
    }
}
