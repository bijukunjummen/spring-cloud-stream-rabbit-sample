package works.processor

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class WorkHandlerApplication

fun main(args: Array<String>) {
    SpringApplication.run(WorkHandlerApplication::class.java, *args)
}