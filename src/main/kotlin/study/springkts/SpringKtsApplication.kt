package study.springkts

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringKtsApplication

fun main(args: Array<String>) {
    runApplication<SpringKtsApplication>(*args)
}
