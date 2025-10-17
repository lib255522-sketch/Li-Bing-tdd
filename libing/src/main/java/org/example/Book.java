package org. example;

public class Book {
    String id;

    public String getId() {
        return id;
    }

    String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    public void setCopiesAvailable(int copiesAvailable) {
        this.copiesAvailable = copiesAvailable;
    }

    public void setId(String id) {
        this.id = id;
    }

    int copiesAvailable;
}
