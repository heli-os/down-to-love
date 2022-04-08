package kr.dataportal.with

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class WithApplication

fun main(args: Array<String>) {
	runApplication<WithApplication>(*args)
}

@RestController
class HelloRestController {

	@GetMapping(
		value = ["/hello"],
		produces = [MediaType.APPLICATION_JSON_VALUE]
	)
	fun hello() = "Hello, Down to love backend application"
}
