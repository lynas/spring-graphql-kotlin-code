package com.lynas.domain

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Delivery(
    @Id
    val deliveryId: String,
    val product: String,
    val supplier: String,
    val quantity: Long,
    val expectedDate: String,
    val expectedWarehouse: String,
    val isReceived: Boolean
)