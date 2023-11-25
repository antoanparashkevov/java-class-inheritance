package com.citb408;

import com.citb408.repo.Author;
import com.citb408.repo.Book;
import com.citb408.repo.Document;
import com.citb408.repo.Novel;

public class Main {
    public static void main(String[] args) {
        Document document = new Document("Document 1", 20.5, ".pdf");

        Author author = new Author("Ivan Vazov");

        Book book = new Book("Pod igoto", 5.3, ".txt", author, "A1");

        System.out.println(document);
        System.out.println(author);
        System.out.println(book);

        Novel novel = new Novel("Novel 1", 5.2, ".pdf", author, "WE678", "abstract");

        System.out.println(novel);
    }
}