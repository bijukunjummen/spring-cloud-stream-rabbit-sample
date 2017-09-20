package works.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import works.service.domain.WorkUnit

import java.util.UUID

@Controller
class SampleWorkController {
    
    @Autowired
    private lateinit var workUnitGateway: WorkUnitGateway

    @RequestMapping("/generateWork")
    @ResponseBody
    fun generateWork(@RequestParam("definition") definition: String): WorkUnit {
        val sampleWorkUnit = WorkUnit(UUID.randomUUID().toString(), definition)
        workUnitGateway.generate(sampleWorkUnit)
        return sampleWorkUnit
    }
}
