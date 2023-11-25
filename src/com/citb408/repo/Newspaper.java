package com.citb408.repo;

public class Newspaper extends Document {
    private int numberOfArticles;

    public Newspaper() {}

    public Newspaper(String name, double size, String fileFormat, int numberOfArticles) {
        super(name, size, fileFormat);
        this.numberOfArticles = numberOfArticles;
    }

    public int getNumberOfArticles() {
        return numberOfArticles;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "numberOfArticles=" + numberOfArticles +
                "} " + super.toString();
    }
}
