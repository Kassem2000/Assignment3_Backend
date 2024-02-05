package com.example.Test_Uppgift.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Document(collection = "BorrowedBooks")
public class BorrowedBooks {

    @Id
    private String id;
    private List<String> booksId = new ArrayList<>();
    @DBRef
    private User userId;
    private Date borrowedDate;
    private Date returnDate;

    public BorrowedBooks(String id, List<String> booksId, User userId, Date borrowedDate, Date returnDate) {
        this.id = id;
        this.booksId = booksId;
        this.userId = userId;
        this.borrowedDate = borrowedDate;
        this.returnDate = returnDate;
    }

    public BorrowedBooks() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getBooksId() {
        return booksId;
    }

    public void setBooksId(List<String> booksId) {
        this.booksId = booksId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
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


