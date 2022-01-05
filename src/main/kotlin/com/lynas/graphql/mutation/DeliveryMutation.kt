package com.lynas.graphql.mutation

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.lynas.domain.Delivery
import com.lynas.repository.DeliveryRepository
import org.springframework.stereotype.Component

@Component
class DeliveryMutation(val deliveryRepository: DeliveryRepository) : GraphQLMutationResolver {

    fun markDeliveryAsReceived(deliveryId : String) : Delivery? {
        val delivery = deliveryRepository.findById(deliveryId).orElse(null)
        if (delivery == null) {
            return delivery
        }
        deliveryRepository.save(delivery.copy(isReceived = true))
        return deliveryRepository.findById(deliveryId).orElse(null)
    }
}