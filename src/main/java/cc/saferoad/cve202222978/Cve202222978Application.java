package cc.saferoad.cve202222978;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"cc.saferoad"})
public class Cve202222978Application {

    public static void main(String[] args) {
        SpringApplication.run(Cve202222978Application.class, args);
    }

}
