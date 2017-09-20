package works.service

import org.springframework.integration.annotation.Gateway
import org.springframework.integration.annotation.MessagingGateway
import works.service.domain.WorkUnit

@MessagingGateway
interface WorkUnitGateway {
    @Gateway(requestChannel = WorkUnitsSource.CHANNEL_NAME)
    fun generate(workUnit: WorkUnit)

}
