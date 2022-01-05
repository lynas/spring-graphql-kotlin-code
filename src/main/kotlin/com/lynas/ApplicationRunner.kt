package com.lynas

import com.lynas.domain.Delivery
import com.lynas.repository.DeliveryRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class ApplicationRunner{

    @Bean
    fun init(deliveryRepository: DeliveryRepository) = CommandLineRunner{
        deliveryRepository.save(Delivery("101","Bananas","JungleInc",1000000,"2027-01-08T07:17:48.237Z","TheMoon", false))
        deliveryRepository.save(Delivery("102","Saiyans","Bardock",9001,"2019-10-10T09:08:11.098Z","Namek", false))
        deliveryRepository.save(Delivery("103","Skull,Crystal","Akator",1,"2008-05-22T00:00:00.001Z","Headquarters", false))
        deliveryRepository.save(Delivery("104","Bananas,Crystal","JungleInc",1,"2020-10-08T07:18:42.937Z","BerlinZoo", false))
        deliveryRepository.save(Delivery("105","Apples","ApplesToOrangesInc",50,"2020-05-01T09:00:42.000Z","Oranges", false))
        deliveryRepository.save(Delivery("106","Salad","HealthyFoodInc",600,"2021-11-01T11:20:42.000Z","Headquarters", false))
        deliveryRepository.save(Delivery("107","Salad","HealthyFoodInc",400,"2021-11-02T11:20:42.000Z","Headquarters", false))
        deliveryRepository.save(Delivery("108","Salad","HealthyFoodInc",800,"2021-11-03T11:20:42.000Z","Headquarters", false))

        deliveryRepository.findAll().forEach{
            println(it)
        }
    }
}

fun main(args: Array<String>) {
    runApplication<ApplicationRunner>(*args)
}
