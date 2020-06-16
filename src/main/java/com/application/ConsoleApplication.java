package com.application;

import com.application.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Service;

@Service
public class ConsoleApplication implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("I am a spring  app!");
        System.out.println(userRepository.findAll());
    }
}
