package works.processor

import org.springframework.cloud.stream.annotation.Input
import org.springframework.messaging.SubscribableChannel

interface WorkUnitsSink {

    @Input
    fun worksChannel(): SubscribableChannel

    companion object {
        const val CHANNEL_NAME = "worksChannel"
    }
}
