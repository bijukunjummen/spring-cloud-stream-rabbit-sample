package works.processor

import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.messaging.support.MessageBuilder
import org.springframework.test.context.junit4.SpringRunner
import works.processor.domain.WorkUnit

@RunWith(SpringRunner::class)
@SpringBootTest
class WorkProcessorTest {
    
    @Autowired
    private lateinit var sink: WorkUnitsSink
    
    @MockBean
    private lateinit var workUnitService: WorkUnitService
    
    @Test
    fun testProcessAWorkUnit() {
        sink.worksChannel().send(MessageBuilder.withPayload(WorkUnit("id", "definition")).build())
     
        Mockito.verify(workUnitService).process(WorkUnit("id", "definition"))
    }
    
}