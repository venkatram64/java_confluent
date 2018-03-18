package com.venkat.avro.service;

import com.venkat.avro.config.KafkaConfig;
import com.venkat.avro.entity.v1.Customer;
import com.venkat.avro.producer.CustomerV1Producer;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerV1ProducerService {

    @Autowired
    private KafkaConfig kafkaConfig;

    public void producer(){
        CustomerV1Producer customerV1Producer = new CustomerV1Producer();
        Customer customerV1 = Customer.newBuilder()
                .setFirstName("Srijan")
                .setLastName("Veerareddy")
                .setAge(17)
                .setHeight(167.2f)
                .setWeight(52.4f)
                .setAutomatedEmail(false)
                .build();

        customerV1Producer.produce(customerV1.getFirstName(), customerV1);
    }

    public static void main(String[] args) {
        CustomerV1ProducerService customerV1Service = new CustomerV1ProducerService();
        customerV1Service.producer();
    }
}
