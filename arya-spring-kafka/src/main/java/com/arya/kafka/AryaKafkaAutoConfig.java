package com.arya.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;



@Configuration
@Slf4j
@ConditionalOnProperty(prefix = "arya.kafka",name = "enabled",havingValue = "true")
@ComponentScan("com.arya.kafka")
@PropertySource("arya-spring-kafka.properties")
public class AryaKafkaAutoConfig {




}
