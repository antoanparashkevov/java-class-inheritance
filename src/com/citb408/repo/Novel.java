package com.citb408.repo;

public class Novel extends Book {
    private String novelAbstract;

    public Novel() {}

    public Novel(String name, double size, String fileFormat, Author author, String isbn, String novelAbstract) {
        super(name, size, fileFormat, author, isbn);
        this.novelAbstract = novelAbstract;
    }

    public String getNovelAbstract() {
        return novelAbstract;
    }

    @Override
    public String toString() {
        return "Novel{" +
                "novelAbstract='" + novelAbstract + '\'' +
                "} " + super.toString();
    }
}
