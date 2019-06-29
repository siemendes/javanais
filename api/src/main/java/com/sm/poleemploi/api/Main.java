package com.sm.poleemploi.api;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication( scanBasePackages={"com.sm.poleemploi.api","com.sm.poleemploi.service"})
@SuppressWarnings("SpringJavaAutowiringInspection")
public class Main {

    final static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(final String[] args) {

        SpringApplication.run(Main.class, args);
    }

}
