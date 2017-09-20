package works.service

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.stream.config.BindersHealthIndicatorAutoConfiguration

@SpringBootApplication
class WorkDispatcherMain

fun main(args: Array<String>) {
    SpringApplication.run(WorkDispatcherMain::class.java, *args)
}
