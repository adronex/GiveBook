package by.givebook.entities.offer;

import by.givebook.entities.account.User;
import by.givebook.entities.IdEntity;

import javax.persistence.*;

/**
 * Created by operb_000 on 29.02.2016.
 */
@Entity
@Table(name = "offer")
public class Offer extends IdEntity {

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "offer_type_id")
    private OfferType offerType;

    public Offer() {
    }

    public Offer(Book book, User user, OfferType offerType) {
        this.book = book;
        this.user = user;
        this.offerType = offerType;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public OfferType getOfferType() {
        return offerType;
    }

    public void setOfferType(OfferType offerType) {
        this.offerType = offerType;
    }
}
