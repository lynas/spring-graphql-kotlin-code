package com.lynas.graphql.query

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.lynas.repository.DeliveryRepository
import org.springframework.stereotype.Component

@Component
class DeliveryQuery(private val deliveryRepository: DeliveryRepository) : GraphQLQueryResolver {

    fun deliveries() = deliveryRepository.findAll()
    fun findDeliveriesByStatus(isReceived:Boolean) = deliveryRepository.findByIsReceived(isReceived)
}