package com.shrivardhan.springboot;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
    private static final Logger logger = LogManager.getLogger(Main.class);
    private final JdbcTemplate jdbcTemplate;
    private final Environment environment;

    public Main(JdbcTemplate jdbcTemplate, Environment environment) {
        this.jdbcTemplate = jdbcTemplate;
        this.environment = environment;
        String sql = "SELECT * FROM TAB";

        logger.info("Datasource URL = {}", environment.getProperty("spring.datasource.url"));
        logger.info("Datasource Username = {}", environment.getProperty("spring.datasource.username"));

        try {
            jdbcTemplate.execute(sql);
            logger.info("Database connection successful");
        } catch (Exception exception) {
            logger.error("Database connection failed", exception);
        }
    }

}