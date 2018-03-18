package com.venkat.avro.service;

import com.venkat.avro.config.KafkaConfig;
import com.venkat.avro.entity.Customer;
import com.venkat.avro.producer.CustomerV2Producer;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerV2ProducerService {

    @Autowired
    private KafkaConfig kafkaConfig;

    public void producer(){
        CustomerV2Producer customerV1Producer = new CustomerV2Producer();
        Customer customerV2 = Customer.newBuilder()
                .setFirstName("Srijan")
                .setLastName("Veerareddy")
                .setAge(17)
                .setHeight(167.2f)
                .setWeight(52.4f)
                .setPhoneNumber("1231231234")
                .setEmail("srijan.veerareddy@gmail.com")
                .build();

        customerV1Producer.produce(customerV2.getFirstName(), customerV2);
    }

    public static void main(String[] args) {
        CustomerV2ProducerService customerV1Service = new CustomerV2ProducerService();
        customerV1Service.producer();
    }
}
