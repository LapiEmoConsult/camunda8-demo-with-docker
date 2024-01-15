package be.lapiemoconsult.camunda8demo;

import io.camunda.zeebe.spring.client.annotation.JobWorker;
import org.springframework.stereotype.Service;

@Service
public class Camunda8DemoService {

    @JobWorker(type = "livraison-livre")
    public void sendBook() {
        System.out.printf("Livraison du livre a été éffectuéé.");
    }

    @JobWorker(type = "livraison-aleatoire")
    public void sendRandomGift() {
        System.out.printf("Un article aléatoire a été envoyé.");
    }
}
