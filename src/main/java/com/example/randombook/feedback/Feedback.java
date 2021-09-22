package com.example.randombook.feedback;

import java.sql.Date;

public class Feedback {

    private final int id;
    private final int user;
    private final int book;
    private final int rate;
    private final String text;
    private final Date date;

    public Feedback(int id, int user, int book, int rate, String text, Date date) {
        this.id = id;
        this.user = user;
        this.book = book;
        this.rate = rate;
        this.text = text;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public int getUser() {
        return user;
    }

    public int getBook() {
        return book;
    }

    public int getRate() {
        return rate;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "id=" + id +
                ", user=" + user +
                ", book=" + book +
                ", rate=" + rate +
                ", text='" + text + '\'' +
                ", date=" + date +
                '}';
    }
}
