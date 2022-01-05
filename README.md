# Spring Graphql kotlin

## How to run
- Java 11 required to be installed in the system
- To run the app, `cd` into project and run `./gradlew bootRun` from terminal


## Get Deliver list by status

### Delivered false

```
curl --location --request POST 'http://localhost:8080/graphql' \
--header 'Content-Type: application/json' \
--data-raw '{"query":"query{\r\n    findDeliveriesByStatus(isReceived:false){\r\n        deliveryId\r\n        product\r\n        supplier\r\n        quantity\r\n        expectedDate\r\n        expectedWarehouse\r\n        isReceived\r\n    }\r\n}","variables":{}}'
```

### Delivered true

```
curl --location --request POST 'http://localhost:8080/graphql' \
--header 'Content-Type: application/json' \
--data-raw '{"query":"query{\r\n    findDeliveriesByStatus(isReceived:true){\r\n        deliveryId\r\n        product\r\n        supplier\r\n        quantity\r\n        expectedDate\r\n        expectedWarehouse\r\n        isReceived\r\n    }\r\n}","variables":{}}'
```



## Update status of a delivery

### set delivery id as following deliveryId:\"101\"

```
curl --location --request POST 'http://localhost:8080/graphql' \
--header 'Content-Type: application/json' \
--data-raw '{"query":"mutation{\r\n    markDeliveryAsReceived(deliveryId:\"101\"){\r\n        deliveryId\r\n        product\r\n        supplier\r\n        quantity\r\n        expectedDate\r\n        expectedWarehouse\r\n        isReceived\r\n    }\r\n}","variables":{}}'
```