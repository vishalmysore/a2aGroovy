package com.example

import io.github.vishalmysore.a2a.client.LocalA2ATaskClient
import io.github.vishalmysore.tools4ai.EnableAgent
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
@EnableAgent
class A2AGroovyApp {
    static void main(String[] args) {
        SpringApplication.run(A2AGroovyApp, args)
        def client = new LocalA2ATaskClient()
        def response = client.sendTask("hows the weather in London")
        println "Response: ${response}"
        println "Starting the server..."
    }
}
