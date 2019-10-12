package com.tbar.sda.pokemonAndChuckNorris.movies.order;

import com.tbar.sda.pokemonAndChuckNorris.movies.user.UserDocument;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "order")
public class OrderDocument {
    @Id
    private String id;

    private UserDocument userDocument;

    private List<String> movies;

    private Date orderDate;

    public OrderDocument() {
    }

    public OrderDocument(String id, UserDocument userDocument, List<String> movies, Date orderDate) {
        this.id = id;
        this.userDocument = userDocument;
        this.movies = movies;
        this.orderDate = orderDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserDocument getUserDocument() {
        return userDocument;
    }

    public void setUserDocument(UserDocument userDocument) {
        this.userDocument = userDocument;
    }

    public List<String> getMovies() {
        return movies;
    }

    public void setMovies(List<String> movies) {
        this.movies = movies;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
