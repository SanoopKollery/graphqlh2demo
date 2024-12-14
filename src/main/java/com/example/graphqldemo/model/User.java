package com.example.graphqldemo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

/*
 * @project GraphqlDemo
 * @author Sanoop Kollery
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String username;
    @OneToOne(cascade = {CascadeType.ALL})
    com.example.graphqldemo.model.Address Address;
    @OneToOne(cascade = {CascadeType.ALL})
    PhoneNumber phoneNumber;

}
