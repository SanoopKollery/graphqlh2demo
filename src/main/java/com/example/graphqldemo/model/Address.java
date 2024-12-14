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
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column
    String primaryAddress;
    @ElementCollection
    @Column(name = "secondaryAddresses")
    List<String> secondaryAddresses;
}
