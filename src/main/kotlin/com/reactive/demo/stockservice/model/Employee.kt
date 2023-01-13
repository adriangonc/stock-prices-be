package com.reactive.demo.stockservice.model

import kotlinx.serialization.Serializable


@Serializable
data class Employee(
    val id: String?,
    val name: String,
    val department: String
)