package com.example.JuriySerovDemoBot.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Timestamp;

@Entity(name = "user") // This tells Hibernate to make a table out of this class
@Data
public class User {

    @Id
    private Long chatId;

    private Boolean embedeJoke;

    private String phoneNumber;

    private java.sql.Timestamp registeredAt;

    private String firstName;

    private String lastName;

    private String userName;

    private Double latitude;

    private Double longitude;

    private String bio;

    private String description;

    private String pinnedMessage;
}