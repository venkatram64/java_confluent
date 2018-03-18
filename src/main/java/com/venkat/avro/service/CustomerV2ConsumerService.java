package com.venkat.avro.service;

import com.venkat.avro.consumer.CustomerV2Consumer;

public class CustomerV2ConsumerService {

    public void consumer(){
        CustomerV2Consumer customerV2Consumer = new CustomerV2Consumer();
        customerV2Consumer.consume();
    }

    public static void main(String[] args) {
        CustomerV2ConsumerService customerV2Service = new CustomerV2ConsumerService();
        customerV2Service.consumer();
    }
}
