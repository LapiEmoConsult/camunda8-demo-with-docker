package be.lapiemoconsult.camunda8demo;

import io.camunda.zeebe.client.ZeebeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Camunda8DemoResource {

    @Autowired
    private ZeebeClient zeebeClient;

    @PostMapping("/lapiemiconsult/start")
    public void startNewProcess() {
        zeebeClient.newCreateInstanceCommand()
                .bpmnProcessId("livraison-cadeau")
                .latestVersion()
                .send()
                .join();
    }
}
