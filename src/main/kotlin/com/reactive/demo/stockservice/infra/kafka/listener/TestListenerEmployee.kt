package com.reactive.demo.stockservice.infra.kafka.listener

import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class TestListenerEmployee {

    private val log = LoggerFactory.getLogger(javaClass)

    @KafkaListener(topics = ["topic-test-1"], groupId = "group-test-1")
    fun listen(message: String){
        log.info("Thread: " + Thread.currentThread().id)
        log.info("Mensagem : $message")
    }

}