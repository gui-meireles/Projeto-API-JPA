package restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import restapi.model.Product;

import java.util.Scanner;

@SpringBootApplication
public class JpaApplication {

    static Product product;

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }
}
