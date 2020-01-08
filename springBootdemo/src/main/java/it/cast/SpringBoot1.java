package it.cast;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

@SpringBootApplication
public class SpringBoot1 {

    @Autowired
    private DataSource dataSource;

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot1.class);
    }
}
