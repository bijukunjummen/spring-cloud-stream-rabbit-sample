package works.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.annotation.IntegrationComponentScan;

@SpringBootApplication
@EnableBinding(WorkUnitsSource.class)
@IntegrationComponentScan
public class WorkDispatcherMain {

    public static void main(String[] args) {
        SpringApplication.run(WorkDispatcherMain.class, args);
    }

}
