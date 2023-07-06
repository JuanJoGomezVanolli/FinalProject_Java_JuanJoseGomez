package com.orchestratorProcess.orchestrator.resources;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class UserResources {


    //Nota: A la hora de correr el programa sin haber creado esta clase me daba un error de que no existia una instancia de RestTemplate (esto es llamado en OrchestratorController.java).
    // Investigue un poco y se solucionaba creando una "instancia" o "Bean" de el RestTemplate.
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


}
