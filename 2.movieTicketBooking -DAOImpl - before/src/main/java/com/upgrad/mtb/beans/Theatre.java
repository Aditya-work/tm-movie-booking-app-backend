package com.upgrad.mtb.beans;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
public class Theatre {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    @Column(nullable = false)
    private String theatreName;
    @Column(nullable = false)
    private int noOfSeats;
    @Column(nullable = false)
    private int ticketPrice;

    public Theatre(){}

    public Theatre(String theatreName, int noOfSeats, int ticketPrice) {
        this.theatreName = theatreName;
        this.noOfSeats = noOfSeats;
        this.ticketPrice = ticketPrice;
    }

    @Override
    public String toString() {
        return "Theatre{" +
                "id=" + id +
                ", theatreName='" + theatreName + '\'' +
                ", noOfSeats=" + noOfSeats +
                ", ticketPrice=" + ticketPrice +
                '}';
    }
}
