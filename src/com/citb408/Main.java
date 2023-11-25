package com.citb408;

import com.citb408.repo.*;

public class Main {
    public static void main(String[] args) {
        Document document = new Document("Document 1", 20.5, ".pdf");
        Document document2 = new Document("Document 2", 10, ".pdf");

        Author author = new Author("Ivan Vazov");

        Book book = new Book("Pod igoto", 5.3, ".txt", author, "A1");

        System.out.println(document);
        System.out.println(author);
        System.out.println(book);

        Novel novel = new Novel("Novel 1", 5.2, ".pdf", author, "WE678", "abstract");

        System.out.println(novel);

        Newspaper newspaper = new Newspaper("24 chasa", 24.3, ".txt", 125);

        System.out.println(newspaper);

        Repo repo = new Repo(10);

        repo.uploadDocument(document);
        repo.uploadDocument(document2);
    }
}