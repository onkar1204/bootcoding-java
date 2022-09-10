package com.bootcoding.oops;

public class Books {
    String title;
    int pages;
    String description;
    String author;
    String publisherName;


    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisherName() {
        return publisherName;
    }
}
