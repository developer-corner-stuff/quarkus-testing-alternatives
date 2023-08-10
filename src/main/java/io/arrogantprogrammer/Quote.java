package io.arrogantprogrammer;

public class Quote {

    String text;

    String author;

    public Quote(String text, String author) {
        this.text = text;
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public String getAuthor() {
        return author;
    }
}
