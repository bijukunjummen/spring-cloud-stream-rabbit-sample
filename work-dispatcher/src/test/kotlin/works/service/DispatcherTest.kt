package works.service

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.skyscreamer.jsonassert.JSONAssert
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.cloud.stream.test.binder.MessageCollector
import org.springframework.messaging.Message
import org.springframework.test.context.junit4.SpringRunner
import works.service.domain.WorkUnit

@RunWith(SpringRunner::class)
@SpringBootTest
class DispatcherTest {

    @Autowired
    private lateinit var workUnitsSource: WorkUnitsSource

    @Autowired
    private lateinit var gateway: WorkUnitGateway

    @Autowired
    private lateinit var messageCollector: MessageCollector

    @Test
    fun shouldBeDispatched() {
        gateway.generate(WorkUnit("id", "definition"))
        val message: Message<*> = messageCollector.forChannel(workUnitsSource.worksChannel()).poll()
        assertThat(message).isNotNull()
        JSONAssert.assertEquals("""
            |{
            |  "id": "id",
            |  "definition":"definition"
            |} """.trimMargin(), message.payload as String, true
        )
    }
}