package com.example.repository;
import com.example.demo.user;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Locale;

public interface UserRepository extends JpaRepository<user, Integer> {
}
