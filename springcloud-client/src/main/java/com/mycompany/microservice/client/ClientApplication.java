package com.mycompany.microservice.client;

import com.sun.deploy.util.SessionState;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by tao on 17/1/19.
 */
@SpringBootApplication

public class ClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class,args);
    }
}
