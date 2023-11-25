package com.citb408.repo;

public class Author {
    private String name;

    public Author(String name) {//the constructor should be publicly accessible
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                '}';
    }
}
