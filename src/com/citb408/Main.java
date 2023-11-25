package com.citb408;

import com.citb408.repo.Author;
import com.citb408.repo.Book;
import com.citb408.repo.Document;

public class Main {
    public static void main(String[] args) {
        Document document = new Document("Document 1", 20.5, ".pdf");

        Author author =  new Author("Ivan Vazov");

        Book book = new Book("Pod igoto", 5.3, ".txt", author, "A1");

        System.out.println(document);
        System.out.println(author);
        System.out.println(book);
    }
}