package com.enigma;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Main2 {
    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("admin"));
    }
}
