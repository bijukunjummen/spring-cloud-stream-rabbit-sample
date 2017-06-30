package works.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class WorkDispatcherMain {

    public static void main(String[] args) {
        SpringApplication.run(WorkDispatcherMain.class, args);
    }

}
