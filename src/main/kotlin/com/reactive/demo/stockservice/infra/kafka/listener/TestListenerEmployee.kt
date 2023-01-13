package com.reactive.demo.stockservice.infra.kafka.listener

import com.reactive.demo.stockservice.model.Employee
import kotlinx.serialization.decodeFromString
import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.kafka.listener.adapter.ConsumerRecordMetadata
import org.springframework.stereotype.Component
import kotlinx.serialization.json.*


@Component
class TestListenerEmployee {

    private val log = LoggerFactory.getLogger(javaClass)

    @KafkaListener(topics = ["employee-topic"], groupId = "group-test-1")
    fun listen(message: String, metadata : ConsumerRecordMetadata){
        log.info("Topic: ${metadata.topic()} - Partition: ${metadata.partition()} - Offset: ${metadata.offset()}")
        log.info("Thread: " + Thread.currentThread().id)
        log.info("Mensagem : $message")

        //val employee = Json.decodeFromString<Employee>(message)

        //print(employee)
    }

}