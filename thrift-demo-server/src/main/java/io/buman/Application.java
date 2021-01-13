package io.buman;

import io.buman.server.ThriftServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
        try {
            ThriftServer server = context.getBean(ThriftServer.class);
            server.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}