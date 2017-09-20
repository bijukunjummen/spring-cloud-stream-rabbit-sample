package works.service

import org.springframework.cloud.stream.annotation.Output
import org.springframework.messaging.MessageChannel

interface WorkUnitsSource {

    @Output
    fun worksChannel(): MessageChannel

    companion object {
        const val CHANNEL_NAME = "worksChannel"
    }
}
