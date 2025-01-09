package study.springkts.hello

import io.github.oshai.kotlinlogging.KotlinLogging
import org.springframework.web.bind.annotation.*

private val logger = KotlinLogging.logger {}

@RestController
@RequestMapping("/hello")
class HelloController {

    @GetMapping
    fun hello(): String {
        return "hello"
    }

    @PostMapping
    fun createHello(@RequestBody request: HelloCreateRequest) {
        logger.info { "hello create request: $request" }
    }

}