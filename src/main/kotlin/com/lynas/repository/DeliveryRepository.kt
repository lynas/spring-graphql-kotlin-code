package com.lynas.repository

import com.lynas.domain.Delivery
import org.springframework.data.jpa.repository.JpaRepository

interface DeliveryRepository : JpaRepository<Delivery,String>{

    fun findByIsReceived(isReceived: Boolean) : List<Delivery>
}