package com.example.Test_Uppgift.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "BorrowedBooks")
public class BorrowedBooks {

    @Id
    private String id;
    private String BooksId;
    private String UserId;
    @CreatedDate
    private Date date;

    public BorrowedBooks(String id, String booksId, String userId, Date date) {
        this.id = id;
        BooksId = booksId;
        UserId = userId;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBooksId() {
        return BooksId;
    }

    public void setBooksId(String booksId) {
        BooksId = booksId;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
