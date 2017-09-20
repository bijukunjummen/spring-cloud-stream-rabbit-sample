package works.service

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class WorkDispatcherApplication

fun main(args: Array<String>) {
    SpringApplication.run(WorkDispatcherApplication::class.java, *args)
}
