package cl.duoc.alameda.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoreApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(CoreApplication.class);
        app.run(args);
    }
}