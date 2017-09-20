package works.processor

import org.slf4j.LoggerFactory
import org.springframework.cloud.stream.annotation.StreamListener
import org.springframework.stereotype.Service
import works.processor.domain.WorkUnit

@Service
class WorkHandler(val workUnitService: WorkUnitService) {
    
    @StreamListener(WorkUnitsSink.CHANNEL_NAME)
    fun process(workUnit: WorkUnit) {
        workUnitService.process(workUnit)
    }

}
