package com.example.graphqldemo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

/*
 * @project GraphqlDemo
 * @author Sanoop Kollery
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "phone_number")
public class PhoneNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column
    String primaryPhoneNumber;
    @ElementCollection
    @Column
    List<String> SecondaryPhoneNumbers;
}
