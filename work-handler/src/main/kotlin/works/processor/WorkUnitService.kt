package works.processor

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import works.processor.domain.WorkUnit

@Service
class WorkUnitService {
    
    fun process(workUnit: WorkUnit) {
       LOGGER.info("Handling work unit - id: {}, definition: {}", workUnit.id, workUnit.definition) 
    }

    companion object {
        private val LOGGER = LoggerFactory.getLogger(WorkHandler::class.java)
    }
}