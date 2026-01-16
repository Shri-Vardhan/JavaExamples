package com.shrivardhan.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;

@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired
    private DBconnection db;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Connection con = db.getConnection();
        System.out.println("Connected to DB: " + con);
        con.close();
    }
}
