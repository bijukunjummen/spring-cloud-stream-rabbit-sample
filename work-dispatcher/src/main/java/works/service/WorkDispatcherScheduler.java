package works.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import works.service.domain.WorkUnit;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Component
public class WorkDispatcherScheduler {

    @Autowired
    private WorkUnitGateway workUnitGateway;

    @Scheduled(fixedDelay = 100)
    public void send() {
        workUnitGateway.generate(new WorkUnit(UUID.randomUUID().toString(),
                String.format("Generated at %s",new SimpleDateFormat("HH:mm:ss").format(new Date()))));
    }

}
