package com.arya.kafka;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "arya.kafka")
@Getter
@Setter
public class AryaKafkaProperties {

    private Map<String, Map<String,String>> producers;
}
