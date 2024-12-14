package com.example.graphqldemo.repository;

import com.example.graphqldemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/*
 * @project GraphqlDemo
 * @author Sanoop Kollery
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
