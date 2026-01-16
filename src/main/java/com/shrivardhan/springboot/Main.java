package com.shrivardhan.springboot;
import com.shrivardhan.connector.DBconnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;

@SpringBootApplication(scanBasePackages = {"com.shrivardhan"})
public class Main implements CommandLineRunner {

    @Autowired
    private DBconnection db;

    @Autowired
    private org.springframework.core.env.Environment environment;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Active profiles: " +
                java.util.Arrays.toString(environment.getActiveProfiles()));
        System.out.println("URL = " + environment.getProperty("spring.datasource.url"));
        System.out.println("Username = " + environment.getProperty("spring.datasource.username"));
        System.out.println("Password = " + environment.getProperty("spring.datasource.password"));

        Connection con = db.getConnection();
        System.out.println("Connected to DB: " + con);
        con.close();
    }
}
