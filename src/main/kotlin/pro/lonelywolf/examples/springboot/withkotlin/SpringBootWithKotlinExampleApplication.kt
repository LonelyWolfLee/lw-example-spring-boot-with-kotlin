package pro.lonelywolf.examples.springboot.withkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootWithKotlinExampleApplication

fun main(args: Array<String>) {
	runApplication<SpringBootWithKotlinExampleApplication>(*args)
}
