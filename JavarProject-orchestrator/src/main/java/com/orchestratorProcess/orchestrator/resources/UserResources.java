package com.orchestratorProcess.orchestrator.resources;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class UserResources {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


}
