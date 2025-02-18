package org.example;

import io.micrometer.core.instrument.Metrics;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MetricPublisher {


    @Scheduled(fixedDelay = 3000)
    public void publish() {
        Metrics.counter("app.running", "id", String.valueOf(new Random().nextInt())).increment();
    }
}
