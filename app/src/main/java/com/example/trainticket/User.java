package com.example.trainticket;

import java.io.Serializable;

public class User implements Serializable {


    private String name;
    private String price_Ticket;
    private String Place_of_departure;
    private String Time_of_departure;
    private String Place_of_arrival;
    private String Time_of_arrival;


    public User(String name, String price_Ticket, String Place_of_departure, String Time_of_departure,String Place_of_arrival,String Time_of_arrival) {
        this.name = name;
        this. price_Ticket = price_Ticket;
        this.Place_of_departure = Place_of_departure;
        this.Time_of_departure = Time_of_departure;
        this.Place_of_arrival = Place_of_arrival;
        this.Time_of_arrival = Time_of_arrival;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice_Ticket() {
        return price_Ticket;
    }

    public void setPrice_Ticket(String price_Ticket) {
        this.price_Ticket = price_Ticket;
    }

    public String getPlace_of_departure() {
        return Place_of_departure;
    }

    public void setPlace_of_departure(String place_of_departure) {
        Place_of_departure = place_of_departure;
    }

    public String getTime_of_departure() {
        return Time_of_departure;
    }

    public void setTime_of_departure(String time_of_departure) {
        Time_of_departure = time_of_departure;
    }

    public String getPlace_of_arrival() {
        return Place_of_arrival;
    }

    public void setPlace_of_arrival(String place_of_arrival) {
        Place_of_arrival = place_of_arrival;
    }

    public String getTime_of_arrival() {
        return Time_of_arrival;
    }

    public void setTime_of_arrival(String time_of_arrival) {
        Time_of_arrival = time_of_arrival;
    }
}