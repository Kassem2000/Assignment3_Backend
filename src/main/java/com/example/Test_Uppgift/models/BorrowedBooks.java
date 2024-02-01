package com.example.Test_Uppgift.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "BorrowedBooks")
public class BorrowedBooks {

    @Id
    private String id;
    private String booksId;
    private String userId;
    private Date borrowedDate;
    private Date returnDate;

    public BorrowedBooks(String id, String booksId, String userId, Date borrowedDate, Date returnDate) {
        this.id = id;
        this.booksId = booksId;
        this.userId = userId;
        this.borrowedDate = borrowedDate;
        this.returnDate = returnDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBooksId() {
        return booksId;
    }

    public void setBooksId(String booksId) {
        this.booksId = booksId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(Date borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

}

