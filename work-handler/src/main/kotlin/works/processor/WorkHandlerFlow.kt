package works.processor

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class WorkHandlerFlow

fun main(args: Array<String>) {
    SpringApplication.run(WorkHandlerFlow::class.java, *args)
}