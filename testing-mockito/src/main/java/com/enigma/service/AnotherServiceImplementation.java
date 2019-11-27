package com.enigma.service;

import org.springframework.stereotype.Service;

@Service
public class AnotherServiceImplementation  implements AnotherService{
    @Override
    public void panggiCetak(String message) {
        System.out.println(message);
    }
}
